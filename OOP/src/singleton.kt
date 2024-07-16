/*
Definition: The singleton pattern restricts the instantiation of a class to one single instance.
This is useful when exactly one object is needed to coordinate actions across the system.
Usage: Common use cases include database connections, logging, configuration settings, and more.
 */
fun main() {
    // Accessing the singleton instance of Database
    println(Database)
    println(Database)
    println(Database)
}

// Singleton implementation using the 'object' keyword
object Database {
    init {
        println("DB Created!")
    }
}

// Example of a singleton implementation using a companion object
// This is commented out because we are using the 'object' keyword above

// class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//        }
//    }
// }
