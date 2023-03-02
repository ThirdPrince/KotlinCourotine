package kt_03

import kotlin.math.hypot

/**
 * 实数 虚数
 */
class Complex(var real:Double,var imageinary:Double) {
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imageinary+other.imageinary)
    }

    override fun toString(): String {
        return "real =$real:imagery=$imageinary"
    }

    operator fun invoke():Double{
        return hypot(real,imageinary)
    }
}

class Book{
    infix fun on(any: Any):Boolean{
        return false
    }
}
class Desk

data class Person(var name:String,var age:Int){
    operator fun plus(other:Person):Person{
        return Person(this.name+""+other.name,this.age+other.age)
    }
}

fun main() {
    val complex = Complex(2.0,0.7)
    val complex2 = Complex(3.0,0.9)
    val complex3 = complex + complex2
    //print(complex3)
    println(complex.invoke())

    if(Book() on Desk()){ //dsl

    }
    val person1 = Person("charlie",3)
    val person2 = Person("charlie2",4)
    val person3 = person2+person1
    println(person3)

    val testBean = TestBean("zhy",20)
    testBean.get(0)
    testBean[0]
    val dependency = DependencyHandler()
    val test = {"jdjjf"}
    println(test())
//带接受者lambda方式
    dependency {
        compile("androidx.core:core-ktx:1.6.0")
    }
//    dependency{
//        compile("androidx.core:core-ktx:1.6.0")
//        compile("androidx.core:core-ktx:1.6.0")
//    }




}
data class TestBean(val name:String,val age:Int){
    operator fun get(index:Int):Any{
        return when(index){
            0 ->name
            1 ->age
            else -> name
        }
    }
}

class DependencyHandler{
    //编译库
    fun compile(libString: String){
        println(libString)
    }
    //定义invoke方法
    operator fun invoke(body: DependencyHandler.() -> Unit){
        body()
    }
}

