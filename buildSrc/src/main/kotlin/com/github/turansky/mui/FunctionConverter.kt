package com.github.turansky.mui

internal fun findDefaultFunction(
    name: String,
    content: String,
): String? {
    if (!name.startsWith("use") && !name.startsWith("create"))
        return null

    if (name == "createTransitions")
        return null

    // TEMP
    if (name == "useAutocomplete")
        return null

    val (before, source) = content.split("export default function ")

    val comment = if (before.endsWith("**/\n")) {
        before.substringAfterLast("\n\n")
    } else ""

    var declaration = source
        .substringBefore(";")
        .replace(": Breakpoints,", ": mui.system.Breakpoints,")
        .replace(": Spacing,", ": mui.system.Spacing,")
        .replace("?: ThemeOptions", ": ThemeOptions? = definedExternally")
        .replace("?: SpacingOptions", ": SpacingOptions? = definedExternally")
        .replace("...args: object[]", "vararg args: dynamic")
        .replace("(styles: any): never", "(styles: Any)")
        .replace("useTheme<T = Theme>", "<T : Theme> useTheme")
        .replace("?: T)", ": T? = definedExternally)")

    if ("()" !in declaration && "(\n" !in declaration)
        declaration = declaration.replaceFirst("(", "(\n")
            .replace(", ", ",\n")

    return comment +
            "@JsName(\"default\")\n" +
            "external fun $declaration"
}