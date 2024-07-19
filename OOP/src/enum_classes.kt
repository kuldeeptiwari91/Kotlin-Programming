fun main() {
//    Looping through all the values of the enum class Direction and printing them
//    for (direction in Direction.values()) {
//        println(direction)
//    }
    // Accessing and printing the properties of the EAST enum constant
    println(Direction.EAST.direction)
    println(Direction.EAST.distance)
    println(Direction.EAST.name)
    // Calling the getDetails method on the EAST enum constant
    Direction.EAST.getDetails()
}

// Enum class named Direction with properties and a method
//An enum class is used to define a set of constants that are related to each other.
//In Kotlin, an enum class can have properties and methods just like a regular class.
//Enum constants are defined in the body of the enum class and can have parameters.
enum class Direction(var direction: String, var distance: Int) {
    // Enum constants with their respective properties
    NORTH("North", 10),
    SOUTH("South", 20),
    EAST("East", 30),
    WEST("West", 40);

    // A method inside the enum class to print the details of the enum constant
    fun getDetails() {
        println("Direction: $direction and Distance: $distance")
    }
}
