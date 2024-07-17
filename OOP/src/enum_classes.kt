fun main() {
//    for (direction in Direction.values()) {
//        println(direction)
//    }
    println(Direction.EAST.direction)
    println(Direction.EAST.distance)
    println(Direction.EAST.name)
    Direction.EAST.getDetails()
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("North", 10),
    SOUTH("South", 20),
    EAST("East", 30),
    WEST("West", 40);

    fun getDetails() {
        println("Direction: $direction and Distance: $distance")
    }
}