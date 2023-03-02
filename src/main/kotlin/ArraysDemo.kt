fun main() {
    var mutableListOf = mutableListOf<Int>(1, 2, 3, 4)

    var mutableListOf1 = mutableListOf("a_b_c_d_e_f_G")
    mutableListOf.map(::println)
    mutableListOf1.flatMap {
        it.split("_")
    }.map {
        println(it)
    }
    var str = "a_b_c_d_e_f_G"
    var split = str.split("_")
    println(split.size)

}