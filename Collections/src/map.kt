fun main() {
    // Immutable map: a collection of key-value pairs. Keys are unique, and each key maps to exactly one value.
    val users = mapOf<Int, String>(1 to "John", 2 to "Jessica", 3 to "James", 4 to "May")

    // Iterating over each entry in the map and printing the value
    users.forEach {
        println(it.value) // Prints each value in the map
    }

    // Mutable map: similar to immutable map but can be modified (add, remove, update entries).
    val mutableUsers = mutableMapOf<Int, String>(5 to "Alice", 6 to "Bob")
    mutableUsers[7] = "Charlie" // Adding a new entry
    mutableUsers[6] = "Robert" // Updating an existing entry

    // Iterating over each entry in the mutable map and printing the key and value
    mutableUsers.forEach { (key, value) ->
        println("Key: $key, Value: $value") // Prints each key-value pair in the map
    }
}

/*
In this example:
1. A map is a collection of key-value pairs where each key is unique. In Kotlin, maps are represented by the `Map` interface.
2. There are two main types of maps:
   - Immutable Map (`mapOf`): Once created, it cannot be modified (read-only).
   - Mutable Map (`mutableMapOf`): It can be modified after creation (add, remove, update entries).
3. The `mapOf` function creates an immutable map with integer keys and string values. Each entry is defined using the `to` keyword.
4. The `forEach` function iterates over each entry in the map. The `it` keyword represents each map entry (a key-value pair) during iteration.
5. The `mutableMapOf` function creates a mutable map. New entries can be added or existing entries can be modified.
6. In the mutable map, entries can be accessed and modified using the key.
*/
