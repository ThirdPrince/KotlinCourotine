package kt_03

import kotlin.math.max

fun sum(arg:Int,arg2: Int):Int{
    return arg + arg2
}
val array = arrayOf("1","3","4")
val list = listOf("apple","orange","Pear")

fun main() {
    //println(sum(2, 3))
    println(int2long(5))
    println(sumLam(1,3))
    println(sumLam.invoke(3, 4))


    array.forEach(::println)
    val maxLength = list.maxByOrNull(maxLength)
    println(maxLength)
    runBlock {
        int2long(5)
    }
    println(sumLam)
    println(int2long)
    println(::printUsage is ()->Unit)
    maxLength("9999")


}
fun printUsage(){
    println("请传入两个整形参数，例如 12")
}
val sumLam = {arg1:Int,arg2:Int -> arg1 +arg2}
val sumFunction = fun (arg1:Int,arg2:Int):Int{
    return arg1 + arg2
}
//selector: (T) -> R
val maxLength = {fruit:String -> fruit.length}

val int2long = fun(x:Int):Long{
    return x.toLong()
}

fun runBlock(block:()->Unit){
    val startTime = System.currentTimeMillis();
    block()
    println(System.currentTimeMillis() - startTime)
}


