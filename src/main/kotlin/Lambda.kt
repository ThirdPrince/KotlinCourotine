import rx.Observable
import java.io.File
import java.util.concurrent.Executors

fun main() {

    val text = File(ClassLoader.getSystemResource("input").path).readText()
    Observable.from(text.toCharArray().asIterable()).filter{
        !it.isWhitespace()
    }.groupBy { it }.map { o->o.count().subscribe(){
        println("${o.key}->$it")
    } }.subscribe()

    var newCachedThreadPool = Executors.newCachedThreadPool()
    newCachedThreadPool.execute{
        println("====")
    }

    val names = arrayListOf(Person("charlie",124),Person("hello",440))
    val name =  names.maxByOrNull {
        it.name.length
    }
    println(name)
}
data class Person(val name: String,val age:Int)