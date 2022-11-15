package chapter7 // ktlint-disable filename

class CantCreate private constructor(val message: String) {
    fun showMessage() {
        println(message)
    }

    /**
     * A class can only contain one companion object
     * the companion is accesible via the class's name
     */

    companion object { // can have a name, can be private

        const val lightSpeed = 299_792_458 // a companion is a convenient place to store class constants

        fun factory(msg: String): CantCreate {
            return CantCreate(msg)
        }

        fun sillyPrint(self: CantCreate) {
            println("Accesing ${self.message}")
        }
    }
}

fun main() {
    /**
     * error in private constructor
     */
    // val c1 = CantCreate("Hello world") // ERROR: Cannot access '<init>': it is private in 'CantCreate'

    /**
     * no error using a method to instantiate
     */
    val c1 = CantCreate.factory("Hello world")
    c1.showMessage()

    CantCreate.sillyPrint(c1)

    println("The speed of light is ${CantCreate.lightSpeed} m/s") // accessed via class name!
}
