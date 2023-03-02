import java.math.BigInteger

tailrec fun factorial(num:Int):BigInteger{
    if(num == 0)return BigInteger.valueOf(1L)
    return BigInteger.valueOf(num.toLong()).times(factorial(num-1))
}

fun main() {
    println(factorial(10))
}