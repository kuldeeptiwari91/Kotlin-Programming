fun main() {
    // Array is a collection of similar data types.
    // In Kotlin, an array is created like this:
    // val nameOfArray: Array<DataType> = arrayOf(data)
    // You can also create it like this: val nameOfArray = arrayOf(data)
    // In Kotlin, you can create an array of mixed data types as well.
    val names: Array<String> = arrayOf("John", "Helena")
    // You can change the value stored in the array like this:
    names[1] = "Megan"
    // We can use the index number to get the elements of the array:
    println(names[0])
    println(names[1])
}
