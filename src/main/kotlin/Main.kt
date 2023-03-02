import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
//    repeat(100_000) { // 启动大量的协程
//        launch {
//            delay(5000L)
//            println(".")
//        }
//    }
//    println("-----")

    runBlock {
        List(111_000){
            println("Hello World")
        }
    }
    runBlock {
        Thread.sleep(500)
    }
    println(Demo(3,"charlie").toString())

}

fun runBlock(block:()->Unit){
    val startTime = System.currentTimeMillis();
    block()
    println(System.currentTimeMillis() - startTime)
}

data class Demo(val age :Int,val name:String)