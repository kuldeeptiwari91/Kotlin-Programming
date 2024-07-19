fun main() {
    val user1 = User("James", "Bond", 24)
    val user2 = User("James", "Bond", 24)
    println(user1 == user2)
    println(user2 == user1)
    println(user1)
}

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
//        return "User(firstName = '$firstName'  lastName = '$lastName' age = '$age')"
//    }
//}

data class User(var firstName: String, var lastName: String, var age: Int) {
}