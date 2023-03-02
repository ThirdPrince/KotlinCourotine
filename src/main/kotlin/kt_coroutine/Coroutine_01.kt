package kt_coroutine

import kotlinx.coroutines.*

fun main()   {
  GlobalScope.launch {
        delay(1000L)
        println("world!--${Thread.currentThread().name}")
    }
    println("Hello,")
    Thread.sleep(3000)
//   //job.join()
//    blockDemo();


}
fun blockDemo(){
    runBlocking {
        delay(2000)
        println("block====")
    }
    println("====")
}