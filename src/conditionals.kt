/**
*                              -- OPERATORS --
*                  ==, !=, <, <=, >, >=, ===, !==, ||, &&
*
*  These are the conditional statements that are used pretty often :
*
*  == : Structural Equality :-
*       Please don’t misunderstand this equality operator with the Java == operator as both are different.
*       == operator in Kotlin only compares the data or variables, whereas in Java or other
*       languages == is generally used to compare the references.
* != : Negated part of ==
*
* ===  Referential equality :-
*       This operator is used to compare the reference of two variable or object.
*       It will only be true if both the objects or variables pointing to the same object.
* !== : Negated part of ===
*
*  <= : less than equal to
*  >= : greater than equals to
*  < : less than
*  > : greater than
*
*  || : OR operator
*  && : AND operator
*
*/


fun dummyCompare(arg1: Any, arg2: Any){
    if (arg1 == arg2) {
        println("These things are equal.")
    }
    else{
        println("These things are NOT equal.")
    }
}

fun dummyCheckWeather(temp: Int){
    // This is the old way to do conditionals :

    println("According to if else clause (old way) : ")
    if (temp > 40){
        println("It's Hot outside.")
    }
    else if (temp < 16){
        println("It's cold outside")
    }
    else if (temp < 32){
        println("It's a pretty day.")
    }

    // Kotlin provides you with an amazing and concise way to do it with using keyword : when
    // Find docs here : https://kotlinlang.org/docs/control-flow.html#when-expression

    println("Using when keyword (new and better way) : ")
    when{
        (temp > 40) -> println("It's Hot outside.")
        (temp < 16) -> println("It's cold outside")
        (temp < 32) -> println("It's a pretty day.")
        // You can use an else statement also in here as:
        else -> println("Idk about this temp")
    }
}

fun greetEmployees(name: String) {
    val employees = arrayOf("nitin", "david", "jaeron")

    when (name.lowercase()){
        in employees -> println("Hello $name, Welcome aboard!")
        else -> println("you are not an employee here")
    }
}

fun ternaryOperator(x: Int, y: Int): Int{
    /**
     * Simple syntax in one line :
     *      val variableName = if (condition) value else otherValue
     *
     * (like python)
    */
    return if (x > y) x else y
}

fun main(){
//    dummyCompare(56, 56)
    greetEmployees("Jaeron")
}







