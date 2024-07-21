fun main() {
    val users = mapOf<Int, String>(1 to "John", 2 to "Jessica", 3 to "James", 4 to "May")

    users.forEach{
        println(it.value)
    }
}