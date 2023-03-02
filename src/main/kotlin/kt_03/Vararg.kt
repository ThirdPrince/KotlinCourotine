package kt_03

fun main() {
    val array = intArrayOf(1,3,4,5)
    hello(*array, str = "hello")
}
fun hello(vararg ints:Int,str: String){
    ints.forEach(::println)
}