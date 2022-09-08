package chapter4._04_05.begin

fun main() {
    val myList = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val mySet = setOf(10, 20, 30, 40, 50)
    val myMap = mapOf(1 to 10, 2 to 20, 3 to 30)

    val tList = myList.map { element -> element * 2 }
    println(tList)

    var tMap = myMap.map { element -> Pair(element.key, element.value * 10) } // list
    var tMap2 = myMap.map { element -> Pair(element.key, element.value * 10) }.toMap() // map
    println(tMap)
    println(tMap2)

    /**
     * challenge, count words on  paragraph
     */
    val paragraph = "this is a paragraph with some repeated repeated words paragraph this repeated is is words is, dog"
    val paragraphNoSpecialChar: String = paragraph.replace("[-+.^:,]".toRegex(), "")

    // TODO continuar acá, ver curso regex

    val splitted = paragraphNoSpecialChar.split(" ")

    var map: MutableMap<String, Int> = mutableMapOf()
    splitted.forEach {
        if (map[it] != null) {
            map[it] = map[it]!! + 1 // value updated
        } else {
            map[it] = 1 // new value added
        }
    }
    println("result: $map")
}
