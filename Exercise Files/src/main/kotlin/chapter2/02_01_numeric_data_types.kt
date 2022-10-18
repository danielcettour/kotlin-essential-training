package chapter2._02_01

/**
 * can have more than one main function
 */
fun main() {
    var count: Int = 0 // var is mutable, can change
    val number: Int = 42 // immutable, considered a best practice, use whenever possible. Legible, testable, thread safe.

    val otherNumber = 43 // inferred type

    val myLong: Long = 3000000000L // L for long
    val myByte: Byte = 127 // four digits gives compilation error
    val myShort: Short = 32767 // 327670 out of range, gives compilation error

    val myDouble: Double = 98.6 // inferred
    val myFloat: Float = 12.2F // F for float
    val alsoDouble = 101.5 // inferred

    // convertions
    val asInt = alsoDouble.toInt()
    val asFloat = myLong.toFloat()

    val maxInt = 2_147_483_648 // easier to read with underscores, equals 2147483648

}
