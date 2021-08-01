package com.github.turansky.materialui

import java.io.File

private const val GENERATOR_COMMENT = "Automatically generated - do not modify!"

private enum class Suppress {
    UNUSED_TYPEALIAS_PARAMETER,
    NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE,

    ;
}

// language=Kotlin
private const val PACKAGE = """package material"""

private val ALIASES = setOf(
    "NoSsr",
    "Portal",
)

fun generateKotlinDeclarations(
    typesDir: File,
    sourceDir: File,
) {
    val targetDir = sourceDir.resolve("material")
        .also { it.mkdirs() }

    val directories = typesDir.listFiles { file -> file.isDirectory } ?: return

    directories.asSequence()
        .filter { it.name.isComponentName() }
        .filter { it.name != "StyledEngineProvider" }
        .map {
            val fileName = "${it.name}.d.ts"
            if (it.name !in ALIASES) {
                it
            } else {
                it.parentFile.parentFile
                    .resolve("unstyled")
                    .resolve(it.name)
            }.resolve(fileName)
        }
        .forEach { generate(it, targetDir) }
}

private fun String.isComponentName(): Boolean {
    if ("_" in this)
        return false

    val char = get(0)
    return char == char.toUpperCase() && char != char.toLowerCase()
}

private fun moduleDeclaration(componentName: String): String =
    "@file:JsModule(\"@material-ui/core/$componentName\")\n@file:JsNonModule"


private fun generate(
    definitionFile: File,
    targetDir: File,
) {
    val componentName = definitionFile.name.substringBefore(".")
    val (body, extensions) = convertDefinitions(definitionFile)

    val annotations = moduleDeclaration(componentName)
    targetDir.resolve("$componentName.kt")
        .writeText(fileContent(annotations, body))

    if (extensions.isEmpty())
        return

    targetDir.resolve("$componentName.ext.kt")
        .writeText(fileContent(body = extensions))
}

private fun fileContent(
    annotations: String = "",
    body: String,
) =
    sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        PACKAGE,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")
