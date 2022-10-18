package chapter3._03_04

fun main() {
    // c-style loop
    // for(int i=0; i< 10; i ++){
    //      println("i= %i")
    // }

    for (i in 1..0) {
        println("i = $i")
    }

    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda")
    for (s in students) {
        println(s)
    }

    for ((index, student) in students.withIndex()) {
        println("student $index is $student")
    }

    println()
    println("while")
    var count = 5
    while (count > 0) {
        println("count: $count")
        count--
    }

    println()
    println("do while")
    var count2 = 5
    do {
        println("count2: $count2")
        count2--
    } while (count2 > 0)

    println()
    println("break")
    while (count2 < 10) {
        println("count2: $count2")
        count2++
        if (count2 % 2 == 0) break
    }

    println()
    println("continue")
    count2 = 0
    while (count2 < 10) {
        count2++
        if (count2 % 2 == 0) continue
        println("count2: $count2")
    }
}
