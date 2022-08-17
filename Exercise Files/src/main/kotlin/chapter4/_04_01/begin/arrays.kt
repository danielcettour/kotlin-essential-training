package chapter4._04_01.begin

data class Student(val firstName: String, val grade: Int)

fun main() {
    /**
     * we can't resize arrays. We can initialize with arrayOf()
     */
    val things = arrayOf(1,2,3,"four","five","six") // different types allowed
    things[0] = "zero"
    println(things.contentToString()) // replaces a for loop

    val students = arrayOf<Student>(
        Student("Todd", 6),
        Student("Vern", 5),
        Student("Cecilia", 2),
        Student("John", 4)
    )
    students[1] = Student("Maria", 1)
    println(students.contentToString())

    /**
     * member reference operator, the double colon ::
     */

    val fives = Array(5, ::fiver)
    fives.forEach { print("$it ") }
    println()

    /**
     * operations in arrays
     */

    println("fives has ${fives.size} elements")
    println("indices: ${fives.indices}") // returns 0..4
    println("last index: ${fives.lastIndex}")
    println("first element: ${fives.first()}")
    println("last element: ${fives.last()}")

    /**
     * arrays are boxed, each element is a n object. Boxing makes accessing slower
     * to create array of primitives, use intArrayOf(), shortArray(), etc
     */

    val pInts = intArrayOf(1,2,3)
}

fun fiver(index: Int): Int{
    return index * 5;
}
