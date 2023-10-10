fun main() {
    var userName = "Lydia"

    var age = 37
    age = Int.SIZE_BYTES
    userName = age.toString()

    println("Hello $userName, your age is $age!")
    println("There are many number types, here they are listed by their length!")
    println("Long>Int>Short>Byte>Double>Float")

    var integerNumber = 2
    val floatNumber = 2f
    println("The integer number is:$integerNumber and the float number is:$floatNumber")
    println("adding numbers in string ${integerNumber + floatNumber}")
    println("integerNumber  = ${integerNumber++} first prints the number and then increments it")
    println("integerNumber  = ${++integerNumber} first increments the number and then prints it")

    var myCharValue = 'D'
    val myBoolValue = true

//this is a comment and will not run
}
