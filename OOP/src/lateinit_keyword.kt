fun main() {
    val hii = Hello("John", "Morning")
    hii.greeting = "Good Evening!" // Setting the greeting property after initialization
}

class Hello(var name: String, var greet: String) {
    // lateinit is used for properties that are initialized later (after the object is constructed).
    lateinit var greeting: String // Declaring a lateinit property for deferred initialization
}
