fun main() {
    // Creating instances of the sealed class Result
    val success = Result.Success("Success!")
    val failure = Result.Failure("Failure!")
    // Passing the instances to the getData function
    getData(success)
    getData(failure)
}

// Function to handle different types of Result
fun getData(result: Result) {
    when (result) {
        is Result.Failure -> result.showMessage() // If result is of type Failure, call showMessage
        is Result.Success -> result.showMessage() // If result is of type Success, call showMessage
    }
}

// Sealed class Result which restricts the hierarchy to a specific set of subclasses.
sealed class Result(val message: String) {
    // Method to display the message
    fun showMessage() {
        println("Result: $message")
    }

    // Subclass representing a success result
    class Success(message: String) : Result(message)

    // Subclass representing a failure result
    class Failure(message: String) : Result(message)
}
