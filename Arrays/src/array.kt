fun main() {
    // Array is a collection of similar data types.
    // In Kotlin, an array is created like this:
    // val nameOfArray: Array<DataType> = arrayOf(data)
    // You can also create it like this: val nameOfArray = arrayOf(data)
    val names: Array<String> = arrayOf("John", "Helena")
    // You can change the value stored in the array like this:
    names[1] = "Megan"
    // We can use the index number to get the elements of the array:
    println(names[0])
    println(names[1])

    // In Kotlin, you can create an array of mixed data types as well.
    // We can create a mixed data types array like this:
    val student: Array<Any> = arrayOf("Tom", "Jerry", 45)
    student[2] = "Graduated" // Example of modifying a mixed-type array element
    println(student[0])
    println(student[1])
    println(student[2])
}
