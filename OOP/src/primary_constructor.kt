// This is a Kotlin program demonstrating the use of primary constructors in a class.

fun main() {
    // Using the primary constructor to create an object of the Car1 class
    val car2 = Car1("Tesla", "XY1", "Black", 4)

    // Printing the properties of car2
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    // Calling the methods of car2
    car2.move()
    car2.stop()
}

// Class Car1 with a primary constructor
class Car1(var name: String, var model: String, var color: String, var doors: Int) {
    // Class properties are defined in the primary constructor
    // var name: String, var model: String, var color: String, var doors: Int
    // These properties are initialized with the values passed when the object is created.

    // Method to simulate the car moving
    fun move() {
        println("The car $name is moving")
    }

    // Method to simulate the car stopping
    fun stop() {
        println("The car $name has stopped")
    }
}
