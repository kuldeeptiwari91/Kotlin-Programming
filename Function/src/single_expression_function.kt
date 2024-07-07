fun main() {
    println(sum(4, 6)) // Calling the sum function and printing the result
}

// In Kotlin, we can simplify functions by using single expression functions
// This function:
// fun sum(num1: Int, num2: Int): Int {
//     return num1 + num2
// }
// is equivalent to the below function:
// Single expression functions help reduce boilerplate code
fun sum(num1: Int, num2: Int): Int = num1 + num2
