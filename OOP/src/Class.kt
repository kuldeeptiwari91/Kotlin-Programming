// A class is a blueprint for creating objects.
// It can contain properties (variables) and methods (functions) to define the behavior of the objects created from the class.

fun main() {
    // Creating an object of the Car class using the primary constructor
    // The syntax for creating an object is:
    // val objectName = ClassName()
    // Here, car1 is the object of the Car class
    val car1 = Car()

    // Setting properties of the car1 object
    car1.name = "Tesla"
    car1.model = "XY!"
    car1.color = "black"
    car1.doors = 4

    // Printing properties of the car1 object
    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    // Calling the methods of the car1 object
    car1.move()
    car1.stop()
}

// Define a class named Car
class Car {
    // Properties of the class
    var name = "" // Name of the car
    var model = "" // Model of the car
    var color = "" // Color of the car
    var doors = 0 // Number of doors in the car

    // Method to simulate the car moving
    fun move() {
        println("The car $name is moving")
    }

    // Method to simulate the car stopping
    fun stop() {
        println("The car $name has stopped")
    }
}
