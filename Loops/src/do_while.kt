fun main() {
    val number = 10
    // 'do-while' is another way to create loops in Kotlin.
    // The 'do-while' loop will execute the block of code once, even if the condition is false.
    do {
        println(number)
        // In this case, 'number' is printed once, even though the condition is false.
    } while (number < 10)
    // After the first execution, the condition is checked.
    // Since 'number < 10' is false, the loop terminates.
}
