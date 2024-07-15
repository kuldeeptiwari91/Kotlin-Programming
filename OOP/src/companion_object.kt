fun main() {
//    val calculator = Calculator()
//    val result = calculator.sum(8, 10)
//    println(result)
    Calculator.sum(4,5)
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}