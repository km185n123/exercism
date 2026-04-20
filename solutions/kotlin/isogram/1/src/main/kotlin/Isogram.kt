object Isogram {

    fun isIsogram(input: String): Boolean {
        val word = input.replace("-","").replace(" ","").uppercase()
       
       var result = word.groupBy{ it }
                        .mapValues{ it.value.size }
                        .maxByOrNull{ it.value  }
                        
       return !((result?.value ?: 0) > 1)
        
    }
}
