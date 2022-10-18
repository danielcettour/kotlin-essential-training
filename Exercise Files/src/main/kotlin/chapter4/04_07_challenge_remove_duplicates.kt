package chapter4.`_04_07 challenge_remove_duplicates`.begin

fun main() {
    val animals =
        listOf("apple", "biscuit", "apple", "cat", "cat", "cat",
            "dog", "elephant", "fox", "goat", "elephant")

    val animalSet = animals.toSet()

    println("animalSet: $animalSet")
}
