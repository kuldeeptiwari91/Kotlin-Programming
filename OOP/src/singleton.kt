fun main() {
//    val instance = Database.getInstance()
//    println(instance)
    println(Database)
    println(Database)
    println(Database)
}

//class Database private constructor() {
//
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
//}

object Database {
    init {
        println("DB Created!")
    }
}