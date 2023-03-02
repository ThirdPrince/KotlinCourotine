package kt_03

fun main() {
    val args = arrayOf("1", "2", "3")
    for (arg in args) {
        println(arg)
    }
    for ((index, value) in args.withIndex()) {
        println("$index -> $value")
    }
    for (indexValue in args.withIndex()) {
        println("$indexValue -> ${indexValue.value}")
    }

    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list){
        println(i)
    }

}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }
    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }
    fun remove(int: Int) {
        list.remove(int)
    }
    operator fun iterator():MyIterator{
        println("==")
        return MyIterator(list.iterator())
    }
}