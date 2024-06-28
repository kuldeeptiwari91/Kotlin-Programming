fun main() {

    // There are four basic data types in Kotlin:
    // 1. Integer Data Type
    // 2. Floating-point Data Type
    // 3. Boolean Data Type
    // 4. Character Data Type

    // 1. Integer Data Type
    // Byte
    // bits required to store byte = 8 bits
    val b1: Byte = Byte.MIN_VALUE
    val b2: Byte = Byte.MAX_VALUE
    println("Min value of Byte is: $b1")
    println("Max value of Byte is: $b2")

    // Short
    // bits required to store short = 16 bits
    val s1: Short = Short.MIN_VALUE
    val s2: Short = Short.MAX_VALUE
    println("Min value of Short is: $s1")
    println("Max value of Short is: $s2")

    // Integer
    // bits required to store int = 32 bits
    // Note: The default data type for integer values is Int.
    val i1: Int = Int.MIN_VALUE
    val i2: Int = Int.MAX_VALUE
    println("Min value of Integer is: $i1")
    println("Max value of Integer is: $i2")

    // Long
    // bits required to store long = 64 bits

    // If we want to use a Long integer value, we have to explicitly define it using the datatype or by appending the 'L' letter
    val longValue1: Long = 1000  // Explicitly define it using the Long datatype
    val longValue2 = 1000L       // Kotlin infers it as Long because of the L suffix

    println("Explicit Long Value: $longValue1")
    println("Inferred Long Value: $longValue2")

    val l1: Long = Long.MIN_VALUE
    val l2: Long = Long.MAX_VALUE
    println("Min value of Long is: $l1")
    println("Max value of Long is: $l2")


    // 2. Floating-point Data Type
    // Float
    // bits required to store float = 32 bits

    // Note: In Kotlin, the default floating-point type is Double. If you want to use a Float value,
    // you have to explicitly define it using the Float datatype or by appending the 'f' suffix to the value.
    val floatValue1: Float = 10.5f  // Explicitly define it using the Float datatype
    val floatValue2 = 99.99f        // Kotlin infers it as Float because of the f suffix
    println("Explicit Float Value: $floatValue1")
    println("Inferred Float Value: $floatValue2")

    val f1: Float = Float.MIN_VALUE
    val f2: Float = Float.MAX_VALUE
    println("Min value of Float is: $f1")
    println("Max value of Float is: $f2")

    // Double
    // bits required to store double = 64 bits
    val d1: Double = Double.MIN_VALUE
    val d2: Double = Double.MAX_VALUE
    println("Min value of Double is: $d1")
    println("Max value of Double is: $d2")


    // 3. Boolean Data Type
    // bits required to store boolean = 1 bit
    // Note: Boolean data type represents logical values: true or false.
    val isKotlinFun = true
    val isJavaFun = false
    println("Is Kotlin fun? $isKotlinFun")
    println("Is Java fun? $isJavaFun")

    // 4. Character Data Type
    // bits required to store character = 16 bits
    // Note: Char data type represents single characters enclosed in single quotes ('A', 'Z', etc.).
    val firstLetter: Char = 'A'
    println("First letter of the alphabet: $firstLetter")
}
