package chapter5._05_01

fun main(args: Array<String>) {
    /**
     * edit configuration to pass arguments
     */

    if (args.any()) {
        println("The string = ${args[0]}")
    }

    println()

    for (arg in args) {
        println(arg)
    }
}
