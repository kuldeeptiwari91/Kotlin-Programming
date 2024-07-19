fun main() {
    // Creating two instances of the User data class with the same values
    val user1 = User("James", "Bond", 24)
    val user2 = User("James", "Bond", 24)

    // Checking if user1 is equal to user2 using the '==' operator
    println(user1 == user2) // Prints 'true' because data classes automatically generate an equals() method

    // Checking if user2 is equal to user1 using the '==' operator
    println(user2 == user1) // Prints 'true' because data classes automatically generate an equals() method

    // Printing user1 using the automatically generated toString() method of the data class
    println(user1) // Prints 'User(firstName=James, lastName=Bond, age=24)'
}

// This is the commented out version of the User class
// It manually implements equals(), hashCode(), and toString() methods
//class User(var firstName: String, var lastName: String, var age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//        if (other is User) {
//            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(firstName = '$firstName', lastName = '$lastName', age = '$age')"
//    }
//}

// This is the data class version of the User class
// Data classes automatically provide implementations for equals(), hashCode(), and toString() methods
data class User(var firstName: String, var lastName: String, var age: Int)
