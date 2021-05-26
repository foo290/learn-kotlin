/**
                            ---- DATA CLASSES ----
    Dataclasses are very powerful, You often create classes whose main purpose is to hold data.
    The compiler automatically derives the following members from all properties declared in the primary constructor:

    - getters and setters for all var properties
    - equals() : can compare with other object
    - hashCode()
    - toString() : prints the description of the class along with its properties
    - copy()
    - component1(), component2(), ... : can access the property of a class using component number.

    Constrains:
        - The primary constructor of all dataclass needs to have at least one parameter.
        - Data classes cannot be abstract, open, sealed or inner.
        - All primary constructor parameters need to be marked as val or var.

        Providing explicit implementations for the componentN() and copy() functions is not allowed.

 */

data class Child(val name: String, val toy: String)

data class Person(val name: String){

    // The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
    // To exclude a property from the generated implementations, declare it inside the class body:

    // This class property will be omitted while auto generating implementation of data class.
    val age = "23 y/o"
    // Only the property name will be used inside the toString(), equals(), hashCode(), and copy() implementations,
    // and there will only be one component function component1().
    // While two Person objects can have different ages, they will be treated as equal.
}

/**
 *                          - Copying a data class -
 *  To copy an object for changing some of its properties, but keeping the rest unchanged, use
*   the copy() function.
 * */

data class Anime(val name: String, val seasons: Int)

val aot = Anime("Attack on titans", 4)
val demonSlayer = aot.copy(seasons = 1)

/**
*               - Data classes and destructuring declarations -
 *     can unpack values of properties using destructuring declarations:
 * */

fun getAnimeInfo() {
    val (name, seasons) = aot  // destructing a dataclass (Remember destructing is only allowed for non local variables)
    println("The anime is $name and has $seasons seasons.")
}




