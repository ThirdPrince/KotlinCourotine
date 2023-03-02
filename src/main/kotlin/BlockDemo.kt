import kotlinx.coroutines.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {
    //kotlin()
    java()
}

fun kotlin() = runBlocking{
    repeat(100) {
        launch {
            delay(1000L)
            println(Thread.currentThread().name + "::.")
        }
    }
    println("main")
}

fun java(){
    val executors = Executors.newSingleThreadScheduledExecutor()
    val task = Runnable {
        println(".")
    }

    executors.schedule(task,1,TimeUnit.SECONDS)
    repeat(100_000){
        executors.schedule(task,1,TimeUnit.SECONDS)
    }
}