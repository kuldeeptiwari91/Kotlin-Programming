fun main() {
//    val calculator = Calculator()
//    val result = calculator.sum(8, 10)
//    println(result)
    // Using the companion object to call the sum method directly without creating an instance of Calculator
    val result = Calculator.sum(4, 5)
    println(result)
}

// A class named Calculator
class Calculator {
    // A companion object is an object that is tied to the class rather than instances of the class.
    // It allows us to call methods and access properties directly on the class itself.
    // This is similar to static methods in Java.
    companion object {
        // A function named sum inside the companion object
        // This function takes two integers a and b, and returns their sum
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}
