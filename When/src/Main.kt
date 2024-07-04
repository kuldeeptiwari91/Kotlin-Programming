

fun main() {
    println("Enter the Day!")
    val day: String = readln().lowercase(Locale.getDefault())
    // 'when' is a conditional expression in Kotlin. It is similar to the switch-case in Java.
    // It is used to simplify similar conditions.
    when (day) {
        "monday" -> println("It's Monday")
        "tuesday" -> println("It's Tuesday")
        "wednesday" -> println("It's Wednesday")
        "thursday" -> println("It's Thursday")
        "friday" -> println("It's Friday")
        "saturday" -> println("It's Saturday")
        "sunday" -> println("It's Sunday")
        else -> println("Invalid day")
    }
}
