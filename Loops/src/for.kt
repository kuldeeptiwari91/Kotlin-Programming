fun main() {
    // 'for' is a keyword used to create loops in Kotlin.
    // Loops are useful for performing repeated tasks.
    // Below are examples of different ways to create a 'for' loop with various parameters.

    // Loop from 1 to 10 (inclusive)
    // This loop will print numbers from 1 to 10.
//    for (i in 1..10) {
//        println(i)
//    }

    // Loop from 1 until 10 (exclusive)
    // This loop will print numbers from 1 to 9 (10 is excluded).
//    for (i in 1 until 10) {
//        println(i)
//    }

    // Loop from 10 down to 1 (inclusive)
    // This loop will print numbers from 10 to 1.
//    for (i in 10 downTo 1) {
//        println(i)
//    }

    // Loop from 1 to 10 (inclusive) with a step of 2
    // This loop will print numbers 1, 3, 5, 7, and 9.
    for (i in 1..10 step 2) {
        println(i)
    }
}
