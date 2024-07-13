fun main() {
    val user = Users("Cillian")
    val user1 = Users("Lillian", "Murphy", 28)
}

class Users(var name: String, var lastName: String, var age: Int) {
    constructor(name: String) : this(name, "LastName", 0)
}