fun main() {
    // Creating an instance of UserDetails class with the primary constructor
    val user = UserDetails("Thomas", "Wayne")

    // Lazy initialization of user1
    // 'lazy' is a Kotlin keyword that allows the initialization of a variable only when it is accessed for the first time.
    val user1 by lazy {
        UserDetails("FirstName", "LastName")
    }

    // Accessing user1 for the first time, which triggers the lazy initialization
    println(user1.firstName)
}

class UserDetails(var firstName: String, var lastName: String) {
    // init block runs when an instance of the class is created
    init {
        println("User: $firstName was created!")
    }
}
