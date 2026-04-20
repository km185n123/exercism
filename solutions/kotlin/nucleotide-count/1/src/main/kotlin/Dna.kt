class Dna(val adn: String) {
    private val nucleotides = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
    
    init {
        require(adn.all { nucleotides.containsKey(it) }) {
            "Invalid nucleotide"
        }
    }
   val nucleotideCounts: Map<Char, Int>
        get() = nucleotides +  adn.groupBy{it}
                     .mapValues{it.value.size}
       
}
