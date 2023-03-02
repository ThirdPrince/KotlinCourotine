package kt_03

fun printE(): () -> Unit = { println("E") }
fun main() {

    println("A")
    println("B")
    println("C")
    println("D")
    printE()()
    println("F")
}