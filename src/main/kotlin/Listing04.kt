import os.Handler
import os.Looper
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.swing.plaf.TableHeaderUI

fun main() {
    loopMain {
        println(Thread.currentThread().name + ":A")
        delayDemo(5000) {
            println(Thread.currentThread().name + ":B")
            runOnMainThread {
                println(Thread.currentThread().name + ":C")
            }
        }
    }

    runOnIoThread {
        println("====")
    }
}

fun loopMain(block: () -> Unit) {
    Looper.prepareMainLooper()
    runOnIoThread(block)
    Looper.loop()
}

val ioExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
val delayExecutor = Executors.newScheduledThreadPool(1)
val mainExecutor by lazy {
    Handler(Looper.getMainLooper())
}

fun runOnIoThread(block: () -> Unit) {
    ioExecutor.execute(block)
}

fun runOnMainThread(block: () -> Unit) {
    mainExecutor.post(block)
}

fun delayDemo(ms: Long, block: () -> Unit) {
    delayExecutor.schedule(block, ms, TimeUnit.MILLISECONDS)
}
