package kt_03

fun main() {
    println("请输入算式例如：3 + 4")
    val input = readLine()
    if (input != null) {
        val splits = input.split(" ")
        val arg1 = splits[0].toDouble()
        val op = splits[1]
        val arg2 = splits[2].toDouble()
        println("$arg1 $op  $arg2  = ${Operator(op)(arg1,arg2)}")
    }
    println(apply(3.0, 5.0))


}
val opFun = { l:Double,r :Double-> l * r}
fun apply(l: Double,right: Double):Double{
    return opFun(l,right)
}


class Operator(op: String) {
    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }
    operator fun invoke(left: Double, right: Double):Double{
        return opFun(left,right)
    }
}