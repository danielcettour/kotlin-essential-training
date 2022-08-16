package chapter3._03_05.begin

data class Person(var firstName: String, var lastName: String)

fun main() {
    /**
     * only nullable types can hold a null
     */
    // val person1: Person = null  ->  compile time error
    val person1: Person? = null

    val greeting: String? = "Hello there"

    if(greeting != null) {
        println("Joes says: $greeting")
    }

    /**
     * safe call, question mark
     */
    // question mark '?' needed. If it's null, it will print null. Not useful but better than crashing
    println("greeting length: ${greeting?.length}")

    /**
     * Elvis operator, commonly used as a default value
     */
    val len = greeting?.length ?: 0
    println("length with Elvis operator: $len")

    /**
     * not-null assertion operator
     */
    val badLen = greeting!!.length // will crash if greetings is null

    /**
     * safe cast, 'as?' will return null if the cast operation is not allowed
     */
    val safeGreeting: String? = greeting as? String
}
