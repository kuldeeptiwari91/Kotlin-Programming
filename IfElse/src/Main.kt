fun main() {
    println("Enter your number")
    val myNumber = readln().toInt()

    // if-else is the conditional expression in Kotlin.
    // When the condition is satisfied, the if part is executed.
    // If the condition is not satisfied, then the else part is executed.
    // In this example, if the number is less than 0, the if part is executed.
    // The else if part is executed if its condition is true, which is number is greater than 0
    // The else part is executed only when all the other conditions are false.
    if (myNumber < 0) {
        println("The number is negative")
    } else if (myNumber > 0) {
        println("The number is positive")
    } else {
        println("The number is zero")
    }
}
