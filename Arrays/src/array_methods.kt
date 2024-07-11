fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    // Array methods are inbuilt functions provided by the Kotlin compiler. Some of them are:

    // size method: this method returns the size of the array
    println("Size: ${numbers.size}")

    // get(index: Int): this method is used to get the value at a particular index
    println("Element at index 4: ${numbers.get(4)}")

    // indexOf(element: T): this method is used to get the first occurrence of the element in the array
    println("First occurrence of 2: ${numbers.indexOf(2)}")

    // sum(): Returns the sum of all elements in the array (only for numeric arrays).
    println("Sum of elements: ${numbers.sum()}")

    // average(): Returns the average value of elements in the array (only for numeric arrays).
    println("Average of elements: ${numbers.average()}")

    // count(): Returns the number of elements in the array.
    println("Count of elements: ${numbers.count()}")

    // sort(): Sorts the array in-place in ascending order.
    numbers.sort()
    println("Sorted array: ${numbers.joinToString()}")

    // sorted(): Returns a list of all elements sorted in ascending order.
    val sortedNumbers = numbers.sorted()
    println("Sorted list: $sortedNumbers")

    // sortedDescending(): Returns a list of all elements sorted in descending order.
    val sortedDescendingNumbers = numbers.sortedDescending()
    println("Sorted list in descending order: $sortedDescendingNumbers")

    // isEmpty(): Returns true if the array is empty.
    println("Is array empty? ${numbers.isEmpty()}")

    // isNotEmpty(): Returns true if the array is not empty.
    println("Is array not empty? ${numbers.isNotEmpty()}")

    // reverse(): Reverses the array in-place.
    numbers.reverse()
    println("Reversed array: ${numbers.joinToString()}")
}
