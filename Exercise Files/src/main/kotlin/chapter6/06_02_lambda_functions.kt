package chapter6 // ktlint-disable filename

fun main() {
    val lam: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Sum = ${lam(5,10)}") // not the usual call

    val l = { a: Int, b: Int -> a * b }
    println("5 * 10 = ${l(5,10)}")
    println("invoke 5 * 100 = ${l.invoke(5,100)}")

    val num = listOf(1, 5, 7, 9, 10, 13)

    /**
     * Extending existing classes with lambda
     */

    println("filtering (trailing lambda): ${num.filter { it <= 7 }}")

    /**
     * Extending existing classes with lambda
     */
    val greet: String.() -> String = {
        "What's up $this"
    }
    println("Joseph".greet())

    val greetAge: String.(Int) -> String = {
            age: Int ->
        "What's up $this, you are $age years old"
    }
    println("Joseph".greetAge(10))

    /**
     * Complex lambdas
     * https://blog.logrocket.com/a-complete-guide-to-kotlin-lambda-expressions/
     */

    /*
    Multiple return
     */

    val lambdaMultipleReturn = greet@{ greeting: String, name: String ->
        if (greeting.length < 3) return@greet ""
        if (greeting.length < 6) return@greet "Welcome!"

        "$greeting $name"
    }

    println(lambdaMultipleReturn("Hey there", "Daniel"))

    /*
    Destructuring with lambda parameters
     */

    val lambdaDestructuring: (Pair<String, Int>) -> Unit = { pair ->
        println("key:${pair.first} - value:${pair.second}")
    }
    lambdaDestructuring("id123" to 5)

    val lambdaDestructuring2: (Pair<String, Int>) -> Unit = { (key, value) ->
        println("key:$key - value:$value")
    }
    lambdaDestructuring2("id456" to 55)

    /*
    Passing lambdas as function arguments
     */

    fun processLanguages(languages: List<String>, action: (String) -> Unit) {
        languages.forEach(action)
    }

    val languages = listOf("Kotlin", "Java", "Swift", "Dart", "Rust")
    val action = { language: String -> println("I code in $language") }

    processLanguages(languages, action)

    processLanguages(languages) { language ->
        println("Hello $language")
    }

    /*
    common uses of trailing lambdas outside
     */

    languages.forEach { println(it) }
    languages
        .filter { it.startsWith("K") }
        .map { it.capitalize() }
        .forEach { println(it) }

    /**
     * SAM conversion
     *
     * If you need to provide an instance of an interface with a single abstract method,
     * SAM conversion lets us use a lambda to represent that interface
     * rather than having to instantiate a new class instance to implement the interface
     */

    // consider this:

    greetLanguages(
        languages,
        object : Greeter {
            override fun greet(item: String) {
                println("(SAM conversion) Hello: $item")
            }
        }
    )

    // now with SAM conversion

    // this line should replace the previous block, but doesn't work
    // greetLanguages(languages) { println("Hello $it") }
}

/**
 * interface and function for SAM conversion
 */

interface Greeter {
    fun greet(item: String)
}

fun greetLanguages(languages: List<String>, greeter: Greeter) {
    languages.forEach { greeter.greet(it) }
}
