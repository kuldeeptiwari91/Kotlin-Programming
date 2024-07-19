fun main() {
    // Creating instances of Car and Truck and calling their startEngine method
    val myCar = Car1("Tesla", "Red")
    myCar.startEngine() // This will print: "The Tesla car is starting engine!"

    val myTruck = Truck("Ford", "Blue")
    myTruck.startEngine() // This will print: "The Ford truck is starting engine!"
}

// Interface definition in Kotlin
// An interface is a blueprint for classes that defines a set of functions and properties that the classes must implement.
interface Engine {
    // Abstract function declaration
    // Any class that implements this interface must provide a concrete implementation of this function.
    fun startEngine()
}

// Class Car implementing the Engine interface
// The Car class must provide an implementation for the startEngine function.
class Car1(var name: String, var color: String) : Engine {
    // Providing the implementation for the startEngine function as required by the Engine interface
    override fun startEngine() {
        println("The $name car is starting engine!")
    }
}

// Class Truck implementing the Engine interface
// The Truck class must provide an implementation for the startEngine function.
class Truck(var name: String, var color: String) : Engine {
    // Providing the implementation for the startEngine function as required by the Engine interface
    override fun startEngine() {
        println("The $name truck is starting engine!")
    }
}
