package chapter6 // ktlint-disable filename

fun replicate(func: (Int, String) -> Unit) {
    func(2, "Be Cool.")
}

fun main() {
    // call replicate() here

    /**
     * my solution
     */
    replicate(
        fun(count: Int, message: String) {
            var c = count
            while (c > 0) {
                println(message)
                c--
            }
        }
    )

    /**
     * instructor's solution, see 06_06
     */
    replicate { count, msg ->
        for (ndx in 1..count)
            println(msg)
    }
}
