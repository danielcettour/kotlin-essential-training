package chapter8 // ktlint-disable filename

fun main() {
    val names = mutableListOf<String>()
    do {
        print("Enter a name (empty to end): ")
        val input = readLine() // read line typed by user and store it in input val
        if (input.isNullOrEmpty()) break
        names.add(input)
        /*
        conditional breakpoint: right click on breakpoint, write condition
        see also: remove once hit, pass count, etc
         */
    } while (true)

    println("\nWe have ${names.size} names")
    for (name in names) {
        println(name)
    }

    print("\nEnter first integer: ")
    val string1 = readLine() ?: "" // Elvis operator
    val integer1: Int = string1.toIntOrNull() ?: 0

    print("\nEnter second integer: ")
    val string2 = readLine() ?: ""
    val integer2: Int = string2.toIntOrNull() ?: 0

    println("\n$integer1 * $integer2 = ${integer1 * integer2}")
}
