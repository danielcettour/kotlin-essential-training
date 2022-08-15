package chapter3._03_03.begin

enum class Suit {
    Club, Diamond, Heart, Spade
}

fun main() {
    val x = 1
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        3,4 -> println("x == 3 or 4")
    }

    val card = Suit.Spade
    val y = when(card) {
        Suit.Club, Suit.Spade -> println("black card")
        Suit.Diamond, Suit.Heart -> println("red card") // we don't need an else block, because when is exhaustive
    }
    println("color card: $y") // will return kotlin.Unit

    val name = "Troy"
    val lastName = when(name){
        "Hattan" -> "Shoboski"
        "Todd" -> "Miller"
        "Troy" -> "Miles"
        else -> { "Unknown"} // mandatory else block, because when is NOT exhaustive
    }
    println("User: $name $lastName")

    /**
     * in 1..3 for a range. The word 'in' is mandatory here
     */
    val ageType = when (x) {
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "adult"
        else -> "senior"
    }
    println("User is a $ageType")
}
