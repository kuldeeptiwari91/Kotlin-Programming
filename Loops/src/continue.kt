fun main() {
    var number = 0

    // 'while' loop checks the condition before each iteration.
    while (number < 10) {
        number++

        // If the number equals 7, skip the current iteration.
        if (number == 7) {
            // 'continue' is used to skip the rest of the code in the current iteration and move to the next iteration of the loop.
            continue
        }

        // Print the current value of number.
        println(number)
    }
}
