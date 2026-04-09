object CollatzCalculator {
   fun computeStepCount(start: Int): Int {
        // Cambiamos el if por un require para lanzar IllegalArgumentException
        require(start > 0) { "Only positive integers are allowed" }
        
        return generateSequence(start) { n -> 
            if (n % 2 == 0) n / 2 else n * 3 + 1 
        }
        .takeWhile { it != 1 }
        .count()
    }
     
}
