fun main() {
    // Creating objects of the Users class using both primary and secondary constructors
    val user = Users("Cillian") // Using the secondary constructor
    val user1 = Users("Lillian", "Murphy", 28) // Using the primary constructor
}

// Class Users with a primary constructor
class Users(var name: String, var lastName: String, var age: Int) {
    // Secondary constructor: Provides an alternative way to create objects
    // Calls the primary constructor with default values for lastName and age

    /*
     Secondary Constructor:
   - The secondary constructor provides an alternative way to create objects of the `Users` class.
   - It takes one parameter, `name`, and calls the primary constructor with default values for `lastName` ("LastName") and `age` (0).
   - The `this` keyword is used to delegate to the primary constructor.
   - This allows for more flexibility in object creation, providing default values when not all parameters are provided.
*/

    constructor(name: String) : this(name, "LastName", 0)
}

