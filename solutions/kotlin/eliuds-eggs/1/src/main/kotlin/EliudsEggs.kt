object EliudsEggs {

    fun eggCount(number: Int): Int{
        return generateSequence(number){it and (it - 1)}
                 .takeWhile{it != 0}
                 .count()

    }
}
