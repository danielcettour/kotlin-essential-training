package chapter4._04_02.begin

fun main() {
    /**
     * operations with lists
     */

    val names = listOf("Daisy", "Henry", "John", "Ronan")
    println("first element: ${names.first()}")
    println("first element: ${names[0]}")
    var subNames = names.subList(1,3)
    println("subNames: $subNames")
    // names.add("Maria") compile error, should convert to mutable list

    val mutableNames = names.toMutableList()
    mutableNames.add("Maria")
    mutableNames[0] = "Rob"
    println("mutableNames $mutableNames")

    println("sublist: ${mutableNames.subList(0,2)}") // won't include element at index 2

    println("item ${mutableNames[0]} removed: ${mutableNames.removeAt(0)}")
    println("item Sandra removed: ${mutableNames.remove("Sandra")}") // returns boolean
    println("first name is: ${mutableNames.first()}")
    println("last name is: ${mutableNames.last()}")


}

