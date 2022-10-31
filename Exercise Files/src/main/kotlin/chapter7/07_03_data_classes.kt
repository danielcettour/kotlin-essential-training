package chapter7 // ktlint-disable filename

/*class Student(val firstName: String, val lastName: String, val grade: Int) {

    // we need to override to avoid printing "chapter7.Student@21bcffb5" when printing the student
    override fun toString(): String {
        return "Student: $firstName, $lastName, $grade"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Student) {
            return (this.firstName == other.firstName && this.lastName == other.lastName && this.grade == other.grade)
        }
        return false
    }

    // intelliJ suggests to override this, after overriding "equals()"
    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + grade
        return result
    }
}*/

// we comment the previous class and create a data class, to create a copy of a student
data class Student(val firstName: String, val lastName: String, val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("abel", "baker", 11),
        Student("abel", "baker", 11),
        Student("delta", "echo", 12)
    )

    println(students[0]) // will print "chapter7.Student@21bcffb5" if we do not override toString() function

    // print if 2 students are identical
    // will return false because kotlin says they are different objects, so we must override "equals" function
    println("${students[0]} == ${students[1]}: ${students[0] == students[1]}")
    println("hashCode: ${students[0].hashCode()}")

    val carol = students[0].copy(firstName = "Carol") // identical twin
    students.add(carol)
    println(students)
}
