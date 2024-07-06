fun main() {
    greetMe() // here default value is passed which is 'Joy'
}
// In Kotlin, default parameter values are used when no argument is provided for a parameter at function call.
// Here, 'Joy' is the default value for 'name' in greetMe function. If 'name' is not specified when calling greetMe, it defaults to 'Joy'.

fun greetMe(name: String = "Joy") {
    return println("Hello, $name")
}