package kt_02

class Girl constructor(var 性格:String,){
    init {
        println("new 了一个妹子")
    }
    constructor( 性格:String, 长相:String, 声音:String) : this(性格) {
        println("new 了一个妹子 constructor")
    }
}


fun main() {
    Girl("温柔","甜美","动人")
}