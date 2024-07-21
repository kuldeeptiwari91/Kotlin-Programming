fun main() {

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    val numbers = numberSets.flatten()
    numbers.forEach{
        println(it)
    }
}