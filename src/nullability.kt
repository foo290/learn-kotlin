fun main() {
    // normal variable
    var name = "foo"
    // Try to assign null to it : name = null (Will give you an error)
    val length = name.length

    // nullable variable
    var nameNullable: String? = "foo"

    // Null Checks
    // Method 1 : (if else clause)
    var len = 0
    if (nameNullable != null){
        len = nameNullable.length
    }
    else {
        len = -1
    }

    // Method 2 : (ternary operator)
    val len2 = if (nameNullable != null) nameNullable.length else -1

    // Method 3: (Safe call operator)
    val len3 = nameNullable?.length  // This will assign the value of length if not null else will assign null

    // Method 4: (Elvis Operator)
    val len4 = nameNullable?.length ?: -1 // This will assign the value of length if not null else will assign default value


    // Creating a null pointer exception using !! operator
    println(nameNullable!!.length)  // This will raise null pointer exception

}