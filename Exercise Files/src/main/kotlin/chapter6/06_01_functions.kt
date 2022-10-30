package chapter6 // ktlint-disable filename

fun main() {
    greeter("Troy")
    println("Volume 1 is ${volume1(10, 5)}")
    println("Volume 2 is ${volume2(width = 7, height = 13)}") // must include names in arguments
}

fun greeter(name: String) = "Hello $name" // one line function!
fun volume1(length: Int, width: Int, height: Int = 10) = length * width * height // default value 10
fun volume2(length: Int = 10, width: Int, height: Int) = length * width * height
