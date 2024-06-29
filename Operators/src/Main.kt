fun main() {
    // There are mainly four types of operators in Kotlin
    // 1. Arithmetic operators
    // 2. Increment and Decrement operators
    // 3. Assignment operators
    // 4. Comparison operators
    // 5. Logical operators

    // 1. Arithmetic operators
    // Addition (+)
    val additionResult = 10 + 5
    println("10 + 5 = $additionResult")

    // Subtraction (-)
    val subtractionResult = 10 - 5
    println("10 - 5 = $subtractionResult")

    // Multiplication (*)
    val multiplicationResult = 10 * 5
    println("10 * 5 = $multiplicationResult")

    // Division (/)
    val divisionResult = 10 / 5
    println("10 / 5 = $divisionResult")

    // Modulus (%)
    val modulusResult = 10 % 3
    println("10 % 3 = $modulusResult")

    // 2. Increment and Decrement operators
    var num = 10

    // Increment Operator (++)
    num++
    println("After increment: $num")  // Output: 11

    // Decrement Operator (--)
    num--
    println("After decrement: $num")  // Output: 10

    // Example of Post-increment and Pre-increment
    var a = 5
    var b = 5

    val postIncrement = a++
    val preIncrement = ++b

    println("Post-increment result: $postIncrement")  // Output: 5
    println("After Post-increment: $a")               // Output: 6

    println("Pre-increment result: $preIncrement")    // Output: 6
    println("After Pre-increment: $b")                // Output: 6

    // Example of Post-decrement and Pre-decrement
    var x = 10
    var y = 10

    val postDecrement = x--
    val preDecrement = --y

    println("Post-decrement result: $postDecrement")  // Output: 10
    println("After Post-decrement: $x")               // Output: 9

    println("Pre-decrement result: $preDecrement")    // Output: 9
    println("After Pre-decrement: $y")                // Output: 9

    // 3. Assignment operators
    // Basic Assignment
    val aValue = 5
    num = aValue
    println("Value of num after basic assignment: $num")  // Output: 5

    // Compound Assignment Operators
    num += 3  // Equivalent to: num = num + 3
    println("Value of num after += 3: $num")              // Output: 8

    num -= 2  // Equivalent to: num = num - 2
    println("Value of num after -= 2: $num")              // Output: 6

    num *= 2  // Equivalent to: num = num * 2
    println("Value of num after *= 2: $num")              // Output: 12

    num /= 3  // Equivalent to: num = num / 3
    println("Value of num after /= 3: $num")              // Output: 4

    num %= 3  // Equivalent to: num = num % 3
    println("Value of num after %= 3: $num")              // Output: 1

    // 4. Comparison operators
    val comparisonA = 5
    val comparisonB = 10

    // Equal to (==)
    println("Is $comparisonA equal to $comparisonB? ${comparisonA == comparisonB}")    // Output: false

    // Not equal to (!=)
    println("Is $comparisonA not equal to $comparisonB? ${comparisonA != comparisonB}") // Output: true

    // Greater than (>)
    println("Is $comparisonA greater than $comparisonB? ${comparisonA > comparisonB}")  // Output: false

    // Less than (<)
    println("Is $comparisonA less than $comparisonB? ${comparisonA < comparisonB}")     // Output: true

    // Greater than or equal to (>=)
    println("Is $comparisonA greater than or equal to $comparisonB? ${comparisonA >= comparisonB}")  // Output: false

    // Less than or equal to (<=)
    println("Is $comparisonA less than or equal to $comparisonB? ${comparisonA <= comparisonB}")     // Output: true

    // 5. Logical operators
    val logicalX = 5
    val logicalY = 10
    val logicalZ = 15

    // Logical AND (&&)
    println("logicalX < logicalY && logicalY < logicalZ: ${logicalX < logicalY && logicalY < logicalZ}")     // Output: true

    // Logical OR (||)
    println("logicalX < logicalY || logicalY > logicalZ: ${logicalX < logicalY || logicalY > logicalZ}")     // Output: true

    // Logical NOT (!)
    println("!(logicalX < logicalY): ${!(logicalX < logicalY)}")                 // Output: false
}
