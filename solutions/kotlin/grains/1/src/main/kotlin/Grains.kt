import java.math.BigInteger

object Board {
     var _total =  BigInteger.valueOf(0)

    fun getGrainCountForSquare(number: Int): BigInteger {
      require(number in 1..64)
        return BigInteger.ONE.shiftLeft(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
       return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE)
    }
}
