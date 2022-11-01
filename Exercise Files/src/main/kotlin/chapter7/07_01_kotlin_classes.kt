package chapter7 // ktlint-disable filename

// class definitions
class PlainShort {} // ktlint-disable no-empty-class-body
class shortClass // valid
class WithConstructor constructor(name: String, age: Int) // word contructor optional
class WithoutConstructor(name: String, age: Int)

// with modifier "internal", the word "constructor" is mandatory
class MandatoryConstructor internal constructor(
    name: String,
    age: Int
)

/**
parameters
 */

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

/*
parameter fistName is a property, lastName is a parameter but not a property, age is mutable
 */
class Person(val firstName: String, lastName: String, var age: Int) {}

// internal val and get() function
class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
        get() {
            return if (field.isNullOrBlank()) "no description" else "$field!"
        }

    fun showTitle() {
        println(title)
    }

    /*
    override toString() to give it a more useful behaviour
     */
    override fun toString(): String {
        return "$title - $description"
    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "secrets you want to know"
    course.showTitle()
    println(course.toString())
    println(course)
}
