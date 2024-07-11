fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    // Array method are inbuilt function which is provided by the kotlin compiler. There is different methods some ot them are:
    // size method: this method return the size of array
    println(numbers.size)
    // get(index: Int) : this method is used to get the value at particular index
    println(numbers.get(4))
    // indexOf(element: T) : this method is used to get the first occurrence of the element in the array
    println(numbers.indexOf(2))
    // sum(): Returns the sum of all elements in the array (only for numeric arrays).
    println(numbers.sum())
    //average(): Returns the average value of elements in the array (only for numeric arrays).
    println(numbers.average())
    //count(): Returns the number of elements in the array.
    println(numbers.count())
    //sort(): Sorts the array in-place in ascending order.
    println(numbers.sort())
    //sorted(): Returns a list of all elements sorted in ascending order.
    println(numbers.sorted())
    //sortedDescending(): Returns a list of all elements sorted in descending order.
    println(numbers.sortDescending())
}