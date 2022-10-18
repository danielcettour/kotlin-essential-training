package chapter5._05_04

import java.io.File

fun main() {
    /**
     * challenge: read sales.txt and create a list of doubles, filtering invalid numbers!
     */
    // val res = "./resources"
    val res = "C:\\Users\\Daniel\\Desktop\\Cursos kotlin\\01 - kotlin essentials - linkedin learning\\Exercise Files\\resources"

    val file = File("$res/sales.txt")

    val myList = mutableListOf<Double>()

    file.forEachLine { value ->
        val aux = value.toDoubleOrNull()
        if (aux != null) myList.add(aux)
    }
    myList.forEach { element -> println(element) }
}
