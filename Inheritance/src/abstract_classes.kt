// Abstract class Animal
abstract class Animal {
    // Abstract property (must be overridden by subclasses)
    abstract val name: String

    // Abstract method (must be implemented by subclasses)
    abstract fun makeSound()

    // Concrete method
    fun describe() {
        println("This is a $name.")
    }
}

// Subclass Dog inheriting from Animal
class Dog : Animal() {
    override val name: String
        get() = "Dog"

    override fun makeSound() {
        println("Woof")
    }
}

// Subclass Cat inheriting from Animal
class Cat : Animal() {
    override val name: String
        get() = "Cat"

    override fun makeSound() {
        println("Meow")
    }
}

fun main() {
    val dog = Dog()
    dog.describe()
    dog.makeSound()

    val cat = Cat()
    cat.describe()
    cat.makeSound()
}
