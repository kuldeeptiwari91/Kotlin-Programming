fun main() {
    val user = User("Cillian", "Murphy", 28)
    val user1 = User("Lillian", "Murphy", 28)
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith("c")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name doesn't start with letter c")
        }
    }
}