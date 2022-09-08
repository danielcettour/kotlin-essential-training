package chapter3._03_06

fun main() {
    val cardPoints = 7_000

    // TODO: replace this if with a when
    // bonus points for using ranges!

    /*val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }*/

    val cardLevel = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1_000..4_999 -> "silver"
        in 5_000..9_999 -> "gold"
        else -> "platinum"
    }

    val plural = if (cardPoints > 1) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}
