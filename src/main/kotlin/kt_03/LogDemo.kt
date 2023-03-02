package kt_03

fun main() {


    val demo = object : Function0<String> {
        override fun invoke(): String {
            return "hjhh "
        }
    }
    val demo2 = {"测试"}
    val demo3 = Demo("test03")
    logd(demo2)
    println(a {
        it.toString()
    })
    println((::b)(1))

}
private fun logd(msg:() -> String){
    println("LOG ${msg()}")
}
fun a(funParam: (Int) -> String): String {
    return funParam(1)
}
fun b(param: Int): String {
    return param.toString()
}
class Demo(private val test:String) :Function0<String>{
    override fun invoke(): String {
       return test
    }

}