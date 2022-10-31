package chapter6 // ktlint-disable filename

fun replicateSolution(func: (Int, String) -> Unit) {
    func(5, "Be Cool.")
}

fun main() {
    replicateSolution { count, msg ->
        for (ndx in 1..count)
            println(msg)
    }
}
