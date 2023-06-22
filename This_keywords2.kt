class Def(var d: Int, var e: Int) {
    var f: Int = 0

    constructor(d: Int, e: Int, f: Int) : this(d, e) {
        this.f = f
    }

    fun show() {
        println(d)
        println(e)
    }

    fun show1() {
        println(d)
        println(e)
        println(f)
    }
}

fun main() {
    val ob = Def(10, 20)
    ob.show1()
}
