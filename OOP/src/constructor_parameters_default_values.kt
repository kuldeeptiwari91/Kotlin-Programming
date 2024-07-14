fun main() {
    // Creating objects of the UsersDetails class using both primary and secondary constructors
    val user = UsersDetails("Cillian") // Uses default values for lastName and age
    val user1 = UsersDetails("Lillian", "Murphy", 28) // Provides values for all parameters
}

// Class UsersDetails with a primary constructor that has default values for lastName and age
class UsersDetails(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    /*
    Explanation:

         Primary Constructor with Default Values:
       - The class UsersDetails is defined with a primary constructor that has three parameters:
         firstName, lastName, and age.
       - The parameters lastName and age have default values of "LastName" and 0, respectively.
       - This means that if these parameters are not provided when creating an object, the default values will be used.

    */
}
