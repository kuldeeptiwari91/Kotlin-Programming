fun main() {
    val gasEngine = GasEngine()
    val car = Car2("Tesla", "Red", gasEngine)
    car.startEngine()
}

// Interface defining the Engine
interface Engine1 {
    fun startEngine()
}

// Class implementing the Engine interface
class GasEngine : Engine {
    override fun startEngine() {
        println("Starting gas engine...")
    }
}

// Car class delegating the Engine interface to the gasEngine object
class Car2(val name: String, val color: String, engine: Engine) : Engine by engine

/*
In this example:
1. The `Engine1` interface defines a method `startEngine`.
2. The `GasEngine` class implements the `Engine` interface and provides an implementation for the `startEngine` method.
3. The `Car2` class has properties `name` and `color`, and it delegates the `Engine` interface to an instance of `GasEngine`.
4. The `Car2` class does not need to implement the `startEngine` method itself; it delegates this responsibility to the `GasEngine` instance.

This approach simplifies the `Car2` class by allowing it to reuse the functionality of `GasEngine` through delegation.
*/
