/*
*       Passing parameters to a function
* */

fun singleParam(param1: String) {
    // Takes a single pram of string type
}

fun variableParam(vararg param1: String){
    // Takes variable number of arguments.
    // Treat param1 as an array
    param1.forEach { println(it) }

    // Methods:
    param1.size
    param1.get(0) // or param1[0]
    param1.iterator()
    param1.indices
}

fun listAsParam(param1: ArrayList<*>){
    // Takes an array as param contains elements of any type
    println(param1)
}

fun mapAsParam(param1: MutableMap<Any, Any>){
    // Takes a map as param containing elements of any type
    println(param1)
}

class Test{
    companion object{}
}

fun main() {
    variableParam("anime", "kdrama")
    listAsParam(arrayListOf("Anime", Test))
    mapAsParam(mutableMapOf("Anime" to "Aot", "class" to Test))
}


















