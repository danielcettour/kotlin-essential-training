package chapter6 // ktlint-disable filename

fun main() {
    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val fNum = num.filter(fun(a: Int): Boolean { return a < 7 })
    println("filter anonymous function")
    println("fNum: $fNum")

    val fNum2 = num.filter(fun(a) = a < 7)
    println("fNum2: $fNum2")

    println()

    val getAgeLambda = lambda@{ age: Int ->
        if (age >= 65) return@lambda "senior discount"
        else if (age >= 21) return@lambda "regular"
        "underage"
    }
    println("getAgeLambda: you need to pay ${getAgeLambda(40)} price")

    println()

    /*
        "fun(age: Int): String" is an anonymous function!
     */
    val getAgeAnonymousFunction = fun(age: Int): String {
        return if (age >= 65) "senior discount"
        else if (age >= 21) "regular"
        else "underage"
    }
    println("getAgeAnonymousFunction: you need to pay ${getAgeAnonymousFunction(70)} price")
}
