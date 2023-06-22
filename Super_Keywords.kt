 /* The error you encountered states that the property a in
  class Ig hides the property a from its supertype Gh. 
  In Kotlin, when a subclass declares a property with the same name
  as a property in its superclass, it is considered as 
  hiding the superclass property.

    To fix this error, you have two options:

    If you intended to override the property 
    a from the superclass, you should mark it
    with the override modifier in the subclass Ig.
    However, since the property a is not defined as open
    in the superclass Gh, it cannot be overridden. 
    Therefore, you need to make the property a in Gh open by adding
     the open modifier to it. */
open class Gh {
   open var a: Int = 0 // instance variable
}

class Ig : Gh() {
   override var a: Int = 0 // instance variable

    fun show() {
        a = 10 // variable of class Ig
        super.a = 20 // it means I am assigning the variable of class Gh: a = 20
        println("Parent class = ${super.a}")
        println("SubClass = $a")
    }
}

fun main() {
    val ob1 = Ig()
    ob1.show()
}
