package chapter2._02_04.begin

fun main() {
    val greeting: String = "Hello there"
    val owe = 50

    /**
     * printing variables with templates
     */
    val janet = "I owe Janet \$$owe dollars"
    println(janet)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    /**
     * access char with index
     */
    val bad = greeting.get(2)
    val letter = greeting[1]

    /**
     * string comparison
     */
    val compare1 = "beta"
    val compare2 = "alpha"
    println("${compare1.compareTo(compare2)}")

    /**
     * subsequence and subtring
     */
    val subSequence = greeting.subSequence(6,9)
    val subString = greeting.substring(5)
    println("subsequence : $subSequence")
    println("substring: $subString")

    for(single in greeting) {
        print( "$single " )
    }

    /**
     * raw string, strings are wrapped in triple quotes
     */
    val myString = """
        Kotlin is fun.
        Kotlin is pragmatic.
    """
    println(myString)
}
