package chapter3._03_01

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1

    /**
     * ternary operator doesn't exist en kotlin, we use if that returns a value
     */

    // won't compile
    // val max = bigger > smaller ? bigger : smaller

    // will compile
    val max = if (bigger > smaller) bigger else smaller

    /**
     * when replaces switch in other languages
     */
    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("group: $boardGroup")

    /**
     * kotlin.Unit is the equivalent to void
     */

    val fromNothing = returnsNothing()
    println("returns kotlin.Unit, equivalent to void in java: $fromNothing")

    /**
     * multiple assignments
     */
    val a = 100
    val b = 101
    // won't compile
    // a = b = 98 *  /* in kotlin, the assignment operator is a statement, making this an error */
}
