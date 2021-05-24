fun loopsInKotlin() {
    val alphabetsCaps = arrayListOf("A", "B", "C", "D")
    var x = 10
    val myMapMutable = hashMapOf(
        "name" to "boom",
        "surname" to "kotlin"
    )

    // Iterating over an array
    for (letter in alphabetsCaps){
        println("Letter is : $letter")
    }

    // Iterating over a map and getting key and value
    for ((key, value) in myMapMutable) {
        println("key is : $key")
        println("value is : $value")
    }

    // simple while loop
    while (x > 0 ){
        println(x)
        x -= 1 // or x--
    }

    // do while loop
    do {
        println("this is still running...")
        x -= 1
    }
        while (x > 0)
}

fun main() {
    loopsInKotlin()
}