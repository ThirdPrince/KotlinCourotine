package kt_03

fun main(args:Array<String>) {
    val x = 5
    val b = when (x){
       // is Int -> println("Hello $x")
        in 1..100 -> println("$x is in 1..100")
        else -> 0

    }
    val mode = when{
        args.isNotEmpty() && args[0] == "1"-> 1
        else -> 0
    }
    println("mode = $mode")
}