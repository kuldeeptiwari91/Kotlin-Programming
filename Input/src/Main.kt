fun main() {
    // How to take input in Kotlin
    println("Enter your name:")
    // In Kotlin, the readln() function is used to take input
    val name: String = readln()
    println("Your name is $name")

    // The default data type of input is String, so we need to explicitly convert it if we want another data type
    println("Enter your age:")
    // This is wrong as the readln() function returns a String and we are explicitly converting it to Int
    // val age: Int = readln()
    val age = readln().toInt()
    println("Your age is $age")
}
