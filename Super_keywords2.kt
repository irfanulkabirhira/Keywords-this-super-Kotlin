/* 
If you intended to make the function msg final
 and prevent it from being overridden in any subclass,
you can keep the final modifier on the function in the Mahi class,
but you should avoid calling 
it using the super keyword in the subclass. */
open class Mahi {
   open var a: Int = 0

    open fun show() {
        println("Parent class")
    }

    fun msg() {
    }
}

class Nafisa : Mahi() {
   override var a: Int = 0

    override fun show() {
        println("Subclass class")
    }

}

fun main() {
    val ob = Mahi()
    ob.msg()
}
