/**
 *          -- Extensions --
 *  Kotlin provides an ability to extend a class with new functionality without having to inherit
 *  from the class or use design patterns such as Decorator.
 *  This is done via special declarations called extensions.
 *
 *  You can write new functions for a class from a third-party library that you can't modify.
 *  Such functions are available for calling in the usual way as if they were methods of the original class.
 *  This mechanism is called extension functions.
 *
 * */

// To declare an extension function, prefix its name with a receiver type, that means the type being extended.
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    // The this keyword inside an extension function corresponds to the receiver object
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

// This function makes sense for any MutableList<T>, and you can make it generic:
fun <T> MutableList<T>.swapElem(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}


fun main() {
    val list = mutableListOf(1, 2, 3)
    val listElem = mutableListOf("a", "b", "c")
    list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'
    listElem.swapElem(0, 2) // 'this' inside 'swap()' will hold the value of 'list'
    println(list)
    println(listElem)
}











