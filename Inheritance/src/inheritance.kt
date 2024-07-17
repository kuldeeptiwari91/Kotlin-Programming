fun main() {
    val car = Car("Volvo", "Blue", 4, 4)
    car.move()
    car.stop()
}

open class Vehicle(var name: String, var color: String) {

    fun move() {
        println("$name is moving!")
    }

    fun stop() {
        println("$name has stopped!")
    }
}

class Car(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name, color) {
}