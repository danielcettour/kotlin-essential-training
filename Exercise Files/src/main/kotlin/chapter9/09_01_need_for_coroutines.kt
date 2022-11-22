package chapter9 // ktlint-disable filename

import kotlinx.coroutines.* // ktlint-disable no-wildcard-imports
import kotlin.system.measureTimeMillis

/**
 * coroutines are not part of courutines core, they are a library, so we need to import kotlinx.coroutines
 * also add the implementation on bouild.gradle
 */

fun main() {
    val time = measureTimeMillis {
        asyncAwait()
    }
    println("$time ms")
}

// suspend make it callable from coroutines
suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

/**
 * will take 3 seconds to finish
 */
fun synchronous() = runBlocking { // runBlocking to make a coroutine
    val x1 = longCalc(100)
    val x2 = longCalc(200)
    val x3 = longCalc(300)
    val sum = listOf(x1, x2, x3).sum() // summation of all the elements in the list
    println("sum is: $sum")
}

/**
 * will take one second to finish
 */
fun asyncAwait() = runBlocking {
    val x1 = async { longCalc(100) } // async, to call await later
    val x2 = async { longCalc(200) }
    val x3 = async { longCalc(300) }
    val sum = listOf(x1, x2, x3).awaitAll().sum() // summation of all the elements in the list
    println("sum is: $sum")
}
