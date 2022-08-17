package chapter4._04_05.begin

fun main() {
    val myList = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val mySet = setOf(10, 20, 30, 40, 50)
    val myMap = mapOf(1 to 10, 2 to 20, 3 to 30)

    var tList = myList.map { element -> element * 2 }
    println(tList)

    var tMap = myMap.map { element -> Pair(element.key, element.value * 10) } // list
    var tMap2 = myMap.map { element -> Pair(element.key, element.value * 10) }.toMap() // map
    println(tMap)
    println(tMap2)

    // TODO continue here
}
