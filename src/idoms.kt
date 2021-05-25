fun main() {
    data class Kids(val name: String, val toy: String)  // A data class
    val obj = Kids("SimpBoi", "pinata")

    // Data class
    println(obj.equals("k"))  // false
    println(obj.hashCode())  // gives the hash code for the class
    println(obj.toString())  // prints the description of the class along with its properties
    println(obj.component1())  // can access the values of properties using component{no.}()

    // Filtering a list:
    // Method 1:
    val myList = listOf(1,2,3,4,-9,-3,2,-3)
    val positives = myList.filter { x -> x > 0 }
    println("These are positive numbers (Method 1): $positives")

    // Method 2:
    val positiveNums = myList.filter { it > 0 }
    println("These are positive numbers (Method 2): $positiveNums")

    // String Interpolation: (like fstring in python)
    val name = "foo"
    println("This is the name $name")

    // Instance checks: (when operator)
    val num = 90
    when (num){
        90 -> println("Number is 90")
        else -> println("Number is not 90")
    }

    // lazy property:
    //      - lazy {...} delegated can only be used for val properties
    //      - Lazy initialization was designed to prevent unnecessary initialization of objects.
    //      - Your variable will not be initialized unless you use it.
    //      - It is initialized only once. Next time when you use it, you get the value from cache memory.
    //      - It is thread safe(It is initialized in the thread where it is used for the first time. Other threads use the same value stored in the cache).
    //      - The variable can only be val.
    //      - The variable can only be "non-nullable".
    val p: String by lazy {
        "hello"
    }
    println(p)

    // lateinit :
    //      -> It is a promise to compiler that the value will be initialized in future.
    class DemoLateInt{
        // Can only be used with mutable variable :
        lateinit var name: String  // allowed
        // lateinit val middleName: String // notAllowed!

        // Can only be used with "non Nullable" data types :
        lateinit var secondName: String // Allowed
        // lateinit var thirdName: String? // notALlowed!
    }
}

