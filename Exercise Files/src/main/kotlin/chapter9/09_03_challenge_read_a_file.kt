package chapter9 // ktlint-disable filename

import kotlinx.coroutines.runBlocking
import java.io.File

fun main() {
    val res = "C:\\Users\\Daniel\\Desktop\\Cursos kotlin\\01 - kotlin essentials - linkedin learning\\Exercise Files\\resources"
    val whale = "the_whale.txt"
    val pFile = File("$res\\$whale")

    runBlocking {
        pFile.forEachLine { println(it) }
    }
}
