package kt_02

fun main() {
    val parent = Child("charlie")
    if(parent is Child){
        println(parent.toString())
    }

}