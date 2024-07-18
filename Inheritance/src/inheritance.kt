fun main() {
    // Creating an object of the Car class
    val car = Car("Volvo", "Blue", 4, 4)
    car.move() // Calling the move method from the Vehicle class
    car.stop() // Calling the stop method from the Vehicle class
}

// The Vehicle class is an open class, which means it can be inherited by other classes
open class Vehicle(var name: String, var color: String) {

    // Method to simulate the vehicle moving
    fun move() {
        println("$name is moving!")
    }

    // Method to simulate the vehicle stopping
    fun stop() {
        println("$name has stopped!")
    }
}

// The Car class inherits from the Vehicle class
// The Car class extends Vehicle class with additional properties: engines and doors
class Car(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name, color) {
}
