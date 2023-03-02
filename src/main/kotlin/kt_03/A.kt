package kt_03
class X

class A {
    var b = 0
    get() {
        println("you get b")
        return field
    }
    set(value) {
        println("you set b")
        field = value
    }
    lateinit var c:String
    val e: X by lazy {
        println("int X")
        X()
    }

    var cc:String ? = null
}

fun main() {
    println("start")
    val a = A()
    println("init a")
    println(a.e)
    println(a.cc?.length)
    val hello = Hello(2,3)
    hello.aFiled
    hello.anotherField

}
class Hello(val aFiled:Int,notAField:Int){
    var anotherField:Float = 3f;
}