fun main() {
    // Immutable list: Cannot be modified after creation. Defined using listOf().
    // Lists are ordered collections of elements and can contain duplicates.
    val names = listOf<String>("Ricky", "Micky")
    println(names[0])  // Accessing the first element of the list

    // Mutable list: Can be modified after creation. Defined using mutableListOf().
    val name = mutableListOf("John", "Joey", "Jerry")
    name.add("Mikey")  // Adding an element to the mutable list
    println(name[3])  // Accessing the fourth element of the list
}

/*
In this example:
1. Lists in Kotlin are collections of elements that maintain the order of insertion.
2. There are two types of lists:
   - Immutable List: Created using `listOf()`, cannot be modified after creation.
   - Mutable List: Created using `mutableListOf()`, can be modified after creation (elements can be added, removed, or changed).

3. The `names` list is immutable, meaning you cannot add or remove elements from it.
4. The `name` list is mutable, allowing you to add elements to it using the `add` method.
5. Both types of lists allow you to access elements by their index, as demonstrated by `names[0]` and `name[3]`.
*/
