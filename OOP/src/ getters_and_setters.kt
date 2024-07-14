// Define a class Person with properties demonstrating getters and setters
class Person {
    // Property with custom getter and setter
    var name: String = "John"
        get() {
            println("Getting name: $field") // Print a message when getting the value
            return field  // Return the backing field value
        }
        set(value) {
            println("Setting name to $value") // Print a message when setting the value
            field = value  // Assign the value to the backing field
        }

    // Immutable property with automatic getter (no setter)
    val age: Int = 30

    // Property with automatic getter and custom setter
    var email: String = ""
        set(value) {
            if (value.isNotBlank()) { // Custom validation for setter
                println("Setting email to $value")
                field = value  // Assign the value to the backing field
            } else {
                println("Email cannot be blank")
            }
        }

    // Property with explicit backing field
    private var _address: String = ""
    var address: String
        get() = _address  // Custom getter for address
        set(value) {
            println("Setting address to $value")
            _address = value  // Assign the value to the backing field
        }
}

fun main() {
    val person = Person()

    // Accessing and modifying properties using getters and setters
    println("Initial name: ${person.name}")  // Accessing the name property (getter is called)
    person.name = "Jane"  // Modifying the name property (setter is called)
    println("Updated name: ${person.name}")

    // Accessing an immutable property with automatic getter
    println("Age: ${person.age}")  // Accessing the age property (getter is called)

    // Modifying property with custom setter
    person.email = "john@example.com"  // Setting the email (custom setter is called)
    println("Email: ${person.email}")

    // Attempting to set an invalid email (blank)
    person.email = ""  // This should print a validation message

    // Modifying property with explicit backing field
    person.address = "123 Main St"
    println("Address: ${person.address}")
}
