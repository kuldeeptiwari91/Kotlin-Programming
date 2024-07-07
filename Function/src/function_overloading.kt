fun main() {
    println(addition(3, 4)) // calls the first addition function
    println(addition(4.5, 5.5)) // calls the second addition function
    println(addition(4.5f, 5.0f)) // calls the third addition function
}

// Function overloading allows us to call the function in different ways depending on the number and types of parameters.
// Function overloading is resolved at compile-time, so the correct function is identified by the compiler.
fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addition(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun addition(num1: Float, num2: Float): Float {
    return num1 + num2
}
