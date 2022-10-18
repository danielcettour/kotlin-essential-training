package chapter5._05_02
import java.util.Scanner

fun main() {
    function1()

    scanner()
}

fun function1() {
    print("Enter text: ")
    val txt = readLine() ?: ""
    print("You entered: $txt, length = ${txt.length}}")

    print("\nEnter an Integer value: ")
    val string1 = readLine() ?: ""
    val iValue: Int = string1.toIntOrNull() ?: 0
    println("You entered: $iValue")

    print("\nEnter an double value: ")
    val string2 = readLine() ?: "" // must be with dot, eg: 2.3
    val dValue: Double = string2.toDoubleOrNull() ?: 0.0
    println("You entered: $dValue")
}

fun scanner() {
    println()
    val scan = Scanner(System.`in`)
    print("Enter an integer number: ")
    val num1 = scan.nextInt()
    print("Enter an double number: ")
    val num2 = scan.nextDouble() // must be with comma, eg: 2,3

    println()
    println("First input number = $num1")
    println("Second input number = $num2")
}
