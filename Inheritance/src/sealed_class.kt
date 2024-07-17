fun main() {
    val success = Result.Success("Success!")
    val failure = Result.Failure("Failure!")
    getData(success)
    getData(failure)
}

fun getData(result: Result) {
    when (result) {
        is Result.Failure -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    class Failure(message: String) : Result(message)
}