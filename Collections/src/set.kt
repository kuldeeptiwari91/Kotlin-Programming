fun main() {
    // Set: A collection that contains no duplicate elements. Each element in a set is unique.
    // Creating an immutable set using the setOf function.
    val names = setOf<String>("Jerry", "John", "Joey", "Jerry")

    // Iterating over each element in the set and printing it
    names.forEach { println(it) } // Only unique elements are printed, duplicates are ignored.
}

/*
In this example:
1. A set is a collection that does not allow duplicate elements. Each element in a set is unique.
2. The `setOf` function creates an immutable set. Once created, its elements cannot be changed (read-only).
3. The set is initialized with a few names, including a duplicate "Jerry".
4. The `forEach` function iterates over each element in the set and prints it. Since sets do not allow duplicates, "Jerry" is printed only once.
5. Sets can be useful when you need to ensure that a collection of elements contains no duplicates.
*/
