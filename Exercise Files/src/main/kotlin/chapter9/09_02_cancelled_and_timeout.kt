package chapter9 // ktlint-disable filename

import kotlinx.coroutines.* // ktlint-disable no-wildcard-imports
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        // timeOut()
        cancel()
    }
    println("$time ms")
}

suspend fun longCalc2(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun timeOut() = runBlocking {
    println("async/await beginning")
    val results = withTimeoutOrNull(1000L) {
        val x1 = async { longCalc2(100) }
        val x2 = async { longCalc2(200) }
        val x3 = async { longCalc2(300) }
        val sum1 = listOf(x1, x2, x3).awaitAll().sum()
        println("async/await results = $sum1")
        "finished"
    } ?: "timed out"

    println("results: $results")
}

fun cancel() = runBlocking {
    val job = launch(Dispatchers.Default) {
        var i = 0
        var nextPrintTime = System.currentTimeMillis()
        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("working for ${i * 100} milliseconds ...")
                nextPrintTime += 100L
                i++
            }
        }
        println("cancelled job! isActive is false")
    }
    // the above loop is still running in the coroutine
    delay(3000L) // this will loop for three seconds after cancelAndJoin is called
    println("cancelling job")
    job.cancelAndJoin() // isActive will be set to false
    println("done")
}
