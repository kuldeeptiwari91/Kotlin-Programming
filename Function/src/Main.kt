fun main() {
    println("Enter the number 1")
    val num1: Int = readln().toInt()
    println("Enter the number 2")
    val num2: Int = readln().toInt()
    getMax(num1, num2)
}

fun sayHello(name: String, age: Int) {
    println("Hello $name and your age is $age")
}

fun getMax(num1: Int, num2: Int) {
    if (num1 > num2) {
        println("Number $num1  greater than number $num2")
    } else if (num2 > num1) {
        println("Number $num2 is greater than number $num1")
    }
    else
    {
        println("Both numbers are equal")
    }
}