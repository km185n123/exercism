object Darts {

    fun score(x: Number, y: Number ): Int {

        // Convertimos a Double para manejar los decimales de los tests
        val xVal = x.toDouble()
        val yVal = y.toDouble()
        
        // La fórmula del círculo: x² + y² = r²
        // Nota: No sacamos raíz cuadrada porque comparar r² es más eficiente
        val d2 = (xVal * xVal) + (yVal * yVal)

        return when {
            d2 <= 1.0 * 1.0   -> 10 // Círculo interno (Radio 1)
            d2 <= 5.0 * 5.0   -> 5  // Círculo medio (Radio 5)
            d2 <= 10.0 * 10.0 -> 1  // Círculo externo (Radio 10)
            else              -> 0  // Fuera del objetivo
        }
    
      

    }
}


