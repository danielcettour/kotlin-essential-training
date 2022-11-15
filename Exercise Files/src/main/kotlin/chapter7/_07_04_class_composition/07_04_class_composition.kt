package chapter7 // ktlint-disable filename

/**
 * heritance and its flaws, see step 1, 2 and 3
 * now will se composition, step 4 and 5
 */
// =========================================================
// STEP 4 replaces everything
// =========================================================

/**
 *   with composition we design our types based on what they do, not what they are
 */
// works
interface IWorker {
    val jobTitle: String
    fun trackHours(hours: Double)
    fun doWork()
}

// exists and has a name
interface IBeing {
    val firstName: String
    fun getName(): String
}

// determines their pay
interface IPayment {
    fun calcPay(): Double
}

// four classes that implement the interfaces

class Worker(override val jobTitle: String) : IWorker { // notice: override val jobTitle
    private var totalHours = 0.0

    override fun trackHours(hours: Double) { // overrides interface function
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

// class Employee requires implementation of each interface

class Employee(worker: IWorker, being: IBeing, pay: IPayment) :
    IWorker by worker, IBeing by being, IPayment by pay {
}

fun main() {
    val hourly = Employee(Worker("Bit Wrangler"), Being("Abel"), HourlyPay(42.42))
    println("My name is ${hourly.getName()}")
    // hourly.doWork()
    (hourly as IWorker).doWork() // employee executes doWork() method of Worker class

    val salaried = Employee(Worker("Program Manager"), Being("Beth"), SalariedPay(100_000.0))
    println("My name is ${salaried.getName()}")
    salaried.doWork()

    // output, same as before:
    /*My name is abel
            Doing bit wrangler work.
    My name is beth
            Doing program manager work.*/

    /**
     * if we want to create a rescue dog object, with has no payment, we can't do it with inheritance.
     * with interfaces is much easier
     */

    val rescueDog = Employee(Worker("Rescue dog"), Being("Fido"), NoPay())
    println("My name is ${rescueDog.getName()}")
    rescueDog.doWork()
}

// =========================================================
// STEP 5 main and NoPay
// =========================================================

class NoPay() : IPayment {
    override fun calcPay(): Double {
        return 0.0
    }
}
