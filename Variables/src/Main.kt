fun main() {
    // There are two ways to declare variables in Kotlin
    // First is using the var keyword
    // Second one is using the val keyword
    // The main difference between var and val is that we cannot assign a new value to val, but we can
    // reassign the value of a variable declared with var.

    // Way to declare a variable
    // keyword (var/val) nameOfTheVariable: dataTypeOfVariable = valueOfTheVariable
    // var userName: String = "Kuldeep"
    // Note: you can also assign the value to a variable at runtime

    // You can declare variables without specifying the type because Kotlin can infer it
    // var userName = "Kuldeep"
    var userName: String = "Kuldeep"  // Explicit type is redundant here
    userName = "John"

    var age: Int = 23
    println("Hello $userName and your age is $age")
}
