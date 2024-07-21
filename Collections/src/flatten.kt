fun main() {
    // List of sets: A list where each element is a set of integers
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    // Flatten: The flatten function takes a collection of collections and combines them into a single collection.
    // In this case, it merges all the sets into one single list.
    val numbers = numberSets.flatten()

    // Iterating over each element in the flattened list and printing it
    numbers.forEach {
        println(it)
    }
}

/*
In this example:
1. `numberSets` is a list containing three sets of integers.
2. The `flatten` function is used to merge all the sets in `numberSets` into a single list named `numbers`.
3. The `forEach` function iterates over each element in the flattened list and prints it.
4. The `flatten` function is useful when you have a collection of collections and you want to work with all the elements as a single collection.
*/
