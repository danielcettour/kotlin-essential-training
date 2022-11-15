package chapter7 // ktlint-disable filename

// =========================================================
// STEP 1
// =========================================================
/**
 * should be abstract */
// class Person(val firstName: String, val ssn: String) {
//     fun getName(): String
// }

// =========================================================
// STEP 2
// =========================================================
/**
 * Person 1 is abstract because we never intantiate it. It has an abstract function
 */
abstract class Person(val firstName: String, val ssn: String) {
    abstract fun getName(): String
}

/*class Employee(
    firstName: String,
    ssn: String, // social security number
    val jobTitle: String,
    val hourlyRate: Double
) : Person(firstName, ssn) {

    var totalHours = 0.0

    override fun getName(): String {
        return firstName
    }

    fun trackHours(hours: Double) {
        totalHours += hours
    }

    fun doWork() {
        println("Doing ${this.jobTitle} work")
    }
}

fun main() {
    val hourly = Employee("Abel", "111-22-3333", "bit wrangler", 42.42)
    println("My name is ${hourly.getName()}")
    hourly.doWork()
}
*//*
output:
My name is Abel
Doing bit wrangler work
 */

// =========================================================
// STEP 3
// =========================================================
/**
 * now we need a salaried employee
 */
open class Employee1(
    firstName: String,
    ssn: String,
    val jobTitle: String,
    val hourlyRate: Double
) : Person(firstName, ssn) {

    var totalHours = 0.0

    override fun getName(): String {
        return firstName
    }

    fun trackHours(hours: Double) {
        totalHours += hours
    }

    open fun doWork() {
        println("Doing ${this.jobTitle} work")
    }
}

/**
 * here, Salaried employee inherits from Employee, and Employee inherits from Person
 * class Salaried inherits a lot of code it doesn't use, this is a flaw in inheritance
 */

class Salaried(
    firstName: String,
    ssn: String,
    jobTitle: String,
    val monthlySalary: Double
) : Employee1(
    firstName,
    ssn,
    jobTitle,
    0.0 // 0.0 for salaried employees
) {}

fun main() {
    val hourly = Employee1("Abel", "111-22-3333", "bit wrangler", 42.42)
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Salaried("Beth", "222-33-4444", "program manager", 12500.0)
    println("My name is ${salaried.getName()}")
    salaried.doWork()
    /*
    output:
    My name is Abel
            Doing bit wrangler work
            My name is Beth
            Doing program manager work*/
}

/*
//=========================================================
// STEP 4 replaces everything
//=========================================================
interface IWorker {
    val jobTitle: String
    fun trackHours(hours: Double)
    fun doWork()
}

interface IBeing {
    val firstName: String
    fun getName(): String
}

class Worker(override val jobTitle: String) : IWorker {
    private var totalHours = 0.0

    override fun trackHours(hours: Double): Unit {
        totalHours += hours
    }

    override fun doWork() {
        println("Doing ${this.jobTitle} work.")
    }
}

class Being(override val firstName: String) : IBeing {
    override fun getName(): kotlin.String {
        return firstName
    }
}

interface IPayment {
    fun calcPay(): Double
}

class HourlyPay(val hourlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return hourlyRate
    }
}

class SalariedPay(val yearlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return yearlyRate
    }
}

class Employee(worker: IWorker, being: IBeing, pay: IPayment) :
    IWorker by worker, IBeing by being, IPayment by pay {
}

fun main() {
    val hourly = Employee(Worker("bit wrangler"), Being("abel"), HourlyPay(42.42))
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Employee(Worker("program manager"), Being("beth"), SalariedPay(100_000.0))
    println("My name is ${salaried.getName()}")
    salaried.doWork()
}

//=========================================================
// STEP 5 main and NoPay
//=========================================================
class NoPay() : IPayment {
    override fun calcPay(): Double {
        return 0.0
    }
}

fun main() {
    val hourly = Employee(Worker("bit wrangler"), Being("abel"), HourlyPay(42.42))
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Employee(Worker("program manager"), Being("beth"), SalariedPay(100_000.0))
    println("My name is ${salaried.getName()}")
    salaried.doWork()

    val rescueDog = Employee(Worker("rescue dog"), Being("fido"), NoPay())
    println("My name is ${rescueDog.getName()}")
    rescueDog.doWork()
}
*/
