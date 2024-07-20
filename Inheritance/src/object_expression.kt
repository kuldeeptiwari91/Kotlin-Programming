/*
Object expressions in Kotlin:
- An object expression is a way to create an instance of an anonymous class.
- It is useful when you need to create an object with slight modifications or for one-time use.
- Unlike regular class declarations, object expressions do not have a name and can be used directly where they are defined.
- They can have properties and methods just like regular classes.
- Object expressions can also be used to implement interfaces or extend classes without declaring a separate named class.

In this example:
1. An anonymous object is created using the `object` keyword.
2. The anonymous object has a property `name` and a method `greet`.
3. The properties and methods of the anonymous object are accessed and modified directly.

This approach provides a concise and flexible way to create objects on the fly, especially for temporary use cases.
*/
fun main() {
    // Creating an anonymous object using object expression
    // An object expression creates an anonymous object with no explicit class declaration.
    // This allows you to define an object and its properties and methods on the fly.
    val myObject = object {
        var name: String = "John Doe"
        fun greet() {
            println("Hello, $name!")
        }
    }

    // Accessing properties and methods of the anonymous object
    // The properties and methods defined in the anonymous object can be accessed directly.
    myObject.greet() // Outputs: Hello, John Doe!
    myObject.name = "Jane Doe" // Modifying the property of the anonymous object
    myObject.greet() // Outputs: Hello, Jane Doe!
}


