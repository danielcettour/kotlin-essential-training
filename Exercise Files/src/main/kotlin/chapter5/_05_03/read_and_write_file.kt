package chapter5._05_03

import java.io.File
import java.nio.file.Paths

fun main() {
    val res = "C:\\Users\\Daniel\\Desktop\\Cursos kotlin\\01 - kotlin essentials - linkedin learning\\Exercise Files\\resources"
    // val res = ".\resources" // relative path doesn't work here
    val pets = "pets.txt"
    val pFile = File("$res/$pets")

    val sep = System.getProperty("file.separator")
    val homeDir = Paths.get(System.getProperty("user.home"))

    println("separator: $sep")
    println("homeDir: ${homeDir.toAbsolutePath()}")

    val exists = pFile.exists()
    println("\npets exists? $exists")

    val file = File("$res/text.txt")
    file.forEachLine { println(it) }

    val writeFile = File("$res/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val pList = listOf("cat", "dog", "bird")
    pFile.writeText("")
    pList.forEach { pFile.appendText("$it\n") }

    val newPets = mutableListOf<String>()
    pFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)
}
