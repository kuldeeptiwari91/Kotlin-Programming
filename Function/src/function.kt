fun main() {
    greet("John") // function call
}

// A function is a block of code used to reduce repetition.
// To create a function, use the 'fun' keyword followed by the function name, parameters (if any), and its return type (if applicable).
// Example: fun functionName(parameter: ParameterType): ReturnType { function body }
// Functions are called where needed to execute their code.

fun greet(name: String) {
    println("Hello $name")
}