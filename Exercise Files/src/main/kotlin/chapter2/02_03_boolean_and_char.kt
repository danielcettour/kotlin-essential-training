package chapter2._02_03

fun firstOperand(): Boolean {
    println("firstOperand")
    return false
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true
}

fun main() {
    demoBoolean()
    println()
    demoChar()
}

private fun demoBoolean() {
    val willExcersice = false
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("is bigger: ${bigNumber > smallNumber}")

    if(firstOperand() || secondOperand()) {
        println("At least one operand is true")
    }

    if(firstOperand() && secondOperand()) {
        // shortcut, the second operand will not evaluate
        println("Both operands are true")
    }

    println("Will excersice= ${!willExcersice}")
}

private fun demoChar() {
    /**
     *  in kotlin, characters are not numbers.
     *  kotlin never does implicit conversions
     */
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter: $letter")
    println("tabbed $tab over")
    println("infinity: $infinity")

    val lineFeed = 10.toChar() // equals \n
    println("line feed = $lineFeed next line")

}
