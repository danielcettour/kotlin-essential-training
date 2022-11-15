package chapter7 // ktlint-disable filename

class Bosco {
    /*constructor() {
        numberOfInstances++
    }*/
    init {
        numberOfInstances++ // see instructor solution
    }
    companion object {
        var numberOfInstances = 0

        fun show() {
            println("$numberOfInstances instances")
        }
    }
}

fun nop() {
    val b = Bosco()
}

fun main() {
    val b1 = Bosco()
    val b2 = Bosco()
    nop()
    val b3 = Bosco()
    Bosco.show()
}
