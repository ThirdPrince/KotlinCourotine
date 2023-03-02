package kotlinbenny

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*


suspend fun main() {
    log(1)
    val job = GlobalScope.launch {
        println(coroutineContext[Job])
        log(2)
    }
    log(3)
    job.join()
    log(4)

}
val dateFormat = SimpleDateFormat("HH:mm:ss:SSS")
val now =
    {
    dateFormat.format(Date(System.currentTimeMillis()))
}
fun log(msg:Any){
    //println(Thread.currentThread().name+"::"+int)
    println("${now()} [${Thread.currentThread().name}]$msg")
}