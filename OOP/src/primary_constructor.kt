fun main() {
    val car2 = Car1("Tesla", "XY1", "Black", 4)

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car1(var name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }

}