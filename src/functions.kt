
fun dummyFun(){
    // Function without parameter, without return type specified explicitly. (Return type is implicit here)
    // This function returns nothing, or as we say in other low level languages: void.
    // But in kotlin void type is referred as Unit type

    println("Hi, I am a dummy function!")
}

fun dummyInfoLog(msg: String){
    // Function with one parameter with specified type of parameter
    // and without return type specified explicitly. (Return type is implicit here)

    println("[INFO] : $msg")
}

fun dummyAdd(num1: Int, num2: Int): Int{
    // Function with two parameter with specified type of parameter
    // Function returns and integer type of value so we specify it explicitly using ":"

    println("Calculating addition of $num1 and $num2 ...")
    return num1 + num2
}

fun dummyDeductTip(amount: Double=120.0){
    // Function with one parameter with default value set to it.
    println("Deducting $amount for the tip.\nThank you for the tip")
}


fun main(){
    dummyFun()
    dummyInfoLog("Initializing start sequence to launch!")

    val result = dummyAdd(54, 6)
    println("This is the result : $result")

    dummyDeductTip() // calling with default
    // dummyDeductTip(500) // calling with custom arg


}


