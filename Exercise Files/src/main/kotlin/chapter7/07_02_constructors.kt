package chapter7 // ktlint-disable filename

class Vehicle(
    val make: String,
    val model: String,
    val year: Int,
    val state: String = "CA"
) {
    override fun toString(): String {
        return "$year $make $model ($state)"
    }

    init {
        // will be called when creating a variable: val car = Vehicle(.....)
        println("first initializer block: $this") // "this" will go to the "toString()" overrided function
    }
    constructor( // secondary constructor with "style" parameter
        make: String,
        model: String,
        year: Int,
        state: String,
        style: String
    ) : this(make = make, model = model, state = state, year = year) { // must call primary constructor
        this.style = style
    }
    constructor( // secondary constructor with "style" parameter
        make: String,
        model: String,
        year: Int,
        state: String,
        style: String,
        status: String
    ) : this(make = make, model = model, style = style, state = state, year = year) { // must call primary constructor
        this.status = status
    }
    private var style = ""
    private var status = ""
}

fun main() {
    val car = Vehicle("Chevrolet", "Volt", 2018)
    println("car: $car")

    val car2 = Vehicle(state = "NV", make = "Chevrolet", model = "Volt", year = 2018)
    println("car 2: $car2")

    val car3 = Vehicle(state = "RI", make = "Tesla", model = "Model S", year = 2019, style = "P100D")
    println("car 3: $car3")

    val car4 = Vehicle(state = "Cal", make = "Tesla", model = "3", year = 2022, style = "Performance", status = "New")
    println("car 4: $car4")
}
