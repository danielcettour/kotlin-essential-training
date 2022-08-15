package chapter3._03_02.begin

fun main() {
    val bigger = 101
    val smaller = 1
    val max = if (bigger > smaller) bigger else smaller

    if(bigger>10) {
        println("bigger than 10")
    } else if (bigger > 100) {
        println("bigger than 100") // bigger is 101 so it will enter the first if statement
    } else {
        println("Not too big")
    }

    val number = 121

    // any branch of the if statement can return a different type value, so "bucket is of type Any"
    val bucket: Any = if(number > 100) {
        "alpha"
    } else if(number < 90) {
        println("less than 90")
        2
    } else if (number > 80) {
        1
    } else {
        0
    }
    println("bucket = $bucket")

    /**
     * if returns a boolean, so next line is redundant
     */
    // val isGreater = if(number > 100) true else false
    val isGreater = number > 100 // replaces the line above
    println("is greater: $isGreater")
}
