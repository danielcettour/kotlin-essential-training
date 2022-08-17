package chapter4._04_04.begin

fun main() {
    /**
     * maps are collections of key-value elements
     * keys must be unique
     * keys can be any type, not only strings
     */
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")

    println("m1 == m2 ? ${m1 == m2}")
    println("m1[2]: ${m1[2]}")
    println("m2[3]: ${m1[3]}")
    println("m1[5]: ${m1.getOrDefault(5, "Not present")}")

    val mutableMap1 = m1.toMutableMap()
    mutableMap1[88] = "epsilon"
    println("mutableMap1: $mutableMap1")

    val cars = mutableMapOf("Ford" to 1903, "GM" to 1908, "Dodge" to 1913, "Tucker" to 1944)
    cars["Tesla"] = 2003 // value added
    cars["Ford"] = 1900 // value updated

    println("Removed tucker: ${cars.remove("Tucker")}")

    println("\nCars: ")
    for (key in cars.keys) print("$key ")
    println()
    println()
    println("Has Ford?: ${"Ford" in cars}")
    println("Has 2003?: ${2003 in cars.values}")


}

