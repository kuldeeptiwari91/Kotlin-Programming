fun main() {

}


interface Engine {
    fun startEngine()
}

class car(var name: String, var color: String) : Engine {
    override fun startEngine() {
        println("The $name car is starting engine!")
    }
}

class Truck(var name: String, var color: String) : Engine {
    override fun startEngine() {
        println("The $name truck is starting engine!")
    }

}