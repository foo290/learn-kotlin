fun arraysInKotlin() {
    // Immutable list
    val alphabets = listOf("a", "b", "c", "d", "e")  // this list is Immutable

    // Methods on an immutable array
    println(alphabets.sorted())
    println(alphabets.size)
    println(alphabets.count())
    println(alphabets[0])
    println(alphabets.get(1))
    println(alphabets.first())
    println(alphabets.last())
    println(alphabets.contains("c"))
    println(alphabets.indexOf("c"))

    // Mutable list
    val alphabetsCaps = arrayListOf("A", "B", "C", "D")

    // Methods on an mutable array
    // Methods which are commonly used and only available for mutable :
    alphabetsCaps.add("E")
    alphabetsCaps.remove("E")
    alphabetsCaps.clear()
    alphabetsCaps.ensureCapacity(23)
    alphabetsCaps.removeAt(0)
    alphabetsCaps.single() // Returns the single element, or throws an exception if the list is empty or has more than one element
}

fun mapsInKotlin() {
    // Immutable maps (maps are like dict in python, A key value pair)
    val myMap = mapOf(
        "name" to "foo",
        "surname" to "boo"
    )

    // Methods available for immutable :
    println(myMap["name"])
    println(myMap.get("name"))
    println(myMap.entries)

    // Returns the value corresponding to the given key, or defaultValue if such a key is not present in the map
    println(myMap.getOrDefault("age", "20"))

    println(myMap.keys)
    println(myMap.values)
    println(myMap.iterator())


    // Mutable maps
    val myMapMutable = hashMapOf(
        "name" to "boom",
        "surname" to "kotlin"
    )

    // Methods which are commonly used and only available for mutable :
    myMapMutable["name"] = "Kaboom"
    myMapMutable.put("age", "20")
    myMapMutable["sex"] = "male"
    myMapMutable.remove("name")
    myMapMutable.clear()

}

fun main(args: Array<String>) {
    mapsInKotlin()
}


