fun translate(rna: String?): List<String> {
    // 1. Manejo del caso nulo inicial
    if (rna == null) return emptyList()

    val aminoAcidTableReference = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine",
        "UUC" to "Phenylalanine",
        "UUA" to "Leucine", 
        "UUG" to "Leucine", // Agregado para completar la tabla
        "UCU" to "Serine", 
        "UCC" to "Serine",
        "UCA" to "Serine",
        "UCG" to "Serine",
        "UAU" to "Tyrosine", 
        "UAC" to "Tyrosine",
        "UGU" to "Cysteine",    // Corregido
        "UGC" to "Cysteine",    // Corregido
        "UGG" to "Tryptophan",  // Corregido
        "UAA" to "STOP",
        "UAG" to "STOP",
        "UGA" to "STOP"
    )
     
    val codones = rna.windowed(size = 3, step = 3, partialWindows = true)
    val result = mutableListOf<String>()

    for (codon in codones) {
        val aminoAcid = aminoAcidTableReference[codon] ?: throw IllegalArgumentException("Invalid codon")
        
        if (aminoAcid == "STOP") {
            break // Detiene el bucle por completo (Comportamiento biológico real)
        }
        result.add(aminoAcid)
    }
   
    return result // Retorna la List<String> prometidaa
}
