package karakum.mui

private val MINUS_LETTER = Regex("""-(\w)""")
private val SPACE_LETTER = Regex("""\s(\w)""")

private val toUpperCase: (MatchResult) -> CharSequence = {
    it.groupValues[1].uppercase()
}

internal fun String.kebabToCamel(): String =
    replace(MINUS_LETTER, toUpperCase)
        .replace(SPACE_LETTER, toUpperCase)
