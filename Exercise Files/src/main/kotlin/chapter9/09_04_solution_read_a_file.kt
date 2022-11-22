package chapter9 // ktlint-disable filename

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() {
    reader()
}

fun reader() = runBlocking {
    val d1 = async { readFile("the_whale.txt") }
    d1.await().forEach { println(it) }
}

fun readFile(fileName: String): List<String> {
    val res = "C:\\Users\\Daniel\\Desktop\\Cursos kotlin\\01 - kotlin essentials - linkedin learning\\Exercise Files\\resources"
    val file = File("$res/$fileName")
    return file.readLines()
}
