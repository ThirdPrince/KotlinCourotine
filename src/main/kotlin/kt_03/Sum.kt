package kt_03

fun main(args: Array<String>) {

    try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1 + $arg2 = ${sum2(arg1, arg2)}")
    } catch (e: NumberFormatException) {
        println("你确定输入的是整数吗？")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("你确定输入的是两个整数吗？")
    } catch (e: Exception) {
        e.printStackTrace()
    }

}

fun sum2(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}