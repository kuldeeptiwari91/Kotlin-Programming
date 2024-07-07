fun main() {
    println(addAll(4, 5, 4, 8))  // Calls addAll with four arguments
    println(addAll(4, 5, 4, 848, 44, 3, 3))  // Calls addAll with seven arguments
}

// 'vararg' allows us to pass a variable number of arguments at runtime
fun addAll(vararg numbers: Int): Int {
    var total = 0
    for (number in numbers) {
        total += number
    }
    return total
}
