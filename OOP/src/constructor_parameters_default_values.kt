fun main() {
    val user = UsersDetails("Cillian")
    val user1 = UsersDetails("Lillian", "Murphy", 28)
}

class UsersDetails(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {

}