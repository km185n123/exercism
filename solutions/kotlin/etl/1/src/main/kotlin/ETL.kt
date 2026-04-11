object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        return source.flatMap{(score, chars) ->
          chars.map{ char-> char.lowercaseChar() to score}
        }.toMap()
    }
}
