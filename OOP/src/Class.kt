fun main() {
    val car1 = Car()
    car1.name = "Tesla"
    car1.model = "XY!"
    car1.color = "black"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }

}