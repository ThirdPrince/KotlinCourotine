import kotlinx.coroutines.runBlocking

fun a0(){
    println("==")
}

suspend fun a1(){

}
fun b0():Int{
    TODO()
}
suspend fun b1():Int{
    TODO()
}
fun Int.c0(block:(Int)->String):String{
    TODO()
}
fun c00(i:Int,block:(Int)->String):String{
    TODO()
}
suspend fun Int.c1(block:(Int)->String):String{
    TODO()
}
fun x(block: suspend Int.((Int)->String)->String){
    runBlocking {
        block(1){
            it.toString()
        }
    }
}

fun main() {
     val type0 = ::a0 // ()-> unit
     type0()
     val type1 = ::a1 // suspend() -> unit
     val type2 = ::b0 // ()->Int
     val type3 = ::b1 // suspend () ->Int
     val typeC0 = Int::c0 //
     val typeC00 = ::c00
}