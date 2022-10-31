package chapter6 // ktlint-disable filename

fun main() {
    val words = listOf("racecar", "civic", "level", "butter")
    words.forEach() {
        if (isPalindrome(it)) {
            println("$it is palindrome")
        } else println("$it is not palindrome")
    }
}

fun isPalindrome(word: String): Boolean {
    fun charsMatch(left: Int, right: Int): Boolean {
        if (right <= left) return true
        return if (word[left].equals(word[right], ignoreCase = true)) charsMatch(left + 1, right - 1)
        else false
    }
    if (word.length < 2) return true
    return charsMatch(0, word.lastIndex)
}
