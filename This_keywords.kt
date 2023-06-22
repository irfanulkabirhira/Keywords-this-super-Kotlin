class Abc {
    var a: Int = 0
    var b: Int = 0

    fun setData(a: Int, b: Int) {
        this.a = a
        this.b = b
    }

    fun show() {
        println(a)
        println(b)
    }
}

fun main() {
    val ob1 = Abc()
    ob1.setData(10, 20)
    ob1.show()
}
