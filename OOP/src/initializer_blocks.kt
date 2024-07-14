fun main() {
    // Creating objects of the User class using the primary constructor
    val user = User("Cillian", "Murphy", 28)
    val user1 = User("Lillian", "Murphy", 28)
}

// Class User with a primary constructor
class User(name: String, var lastName: String, var age: Int) {
    // Property 'name' is initialized in the initializer block
    var name: String

    // Initializer block: Executes immediately after the primary constructor
    init {
        // Checking if the name starts with the letter 'c' (case-insensitive)
        if (name.lowercase().startsWith("c")) {
            // If true, assign the provided name to the property
            this.name = name
        } else {
            // If false, assign "User" to the property and print a message
            this.name = "User"
            println("The name doesn't start with the letter c")
        }
    }
}
