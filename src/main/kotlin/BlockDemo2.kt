import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {

    val executor = Executors.newSingleThreadScheduledExecutor()
    val task = Runnable {
        //Thread.sleep(1000L)

        println(Thread.currentThread().name+"--")
    }
    repeat(100){
        executor.schedule(task,0,TimeUnit.SECONDS)
    }
    println("main")
}