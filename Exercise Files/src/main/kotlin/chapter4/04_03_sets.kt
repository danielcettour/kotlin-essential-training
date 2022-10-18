package chapter4._04_03

fun main() {
    /**
     *  sets are collections of unique elements
     *  sets automatically removes duplicates!
     */
    val threes = setOf(3, 4, 5, 6, 6, 4, 4, 6, 5, 5, 3, 3, 3, 3, 3)
    println(threes) // output [3,4,5,6]

    println()
    val fset = mutableSetOf(1, 2, 3, 4, 5)
    val bset = mutableSetOf(5, 4, 3, 2, 1)
    println("firsts equal? ${fset.first() == bset.first()}")
    println("fset == bset? ${fset == bset}")
    println()

    println("hash sets are always ordered, duplicates are removed!")
    val hashSet1 = hashSetOf(1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 4, 1, 2, 3, 4, 5)
    val hashSet2 = hashSetOf(5, 4, 3, 2, 1, 6, 7, 8, 9, 5, 5, 5, 1, 1, 1)
    println("hashSet1: $hashSet1")
    println("hashSet2: $hashSet2")
    println("firsts equal? ${hashSet1.first() == hashSet2.first()}")
    println("hashSet1 == hashSet2? ${hashSet1 == hashSet2}")
    println()
    println("added 6? ${fset.add(6)}")
    println("removed 76? ${fset.remove(76)}")
    println()
    val aList = hashSet1.toList()
    println(aList)
}
