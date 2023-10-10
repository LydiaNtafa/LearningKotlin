fun main() {
    var userName = "Lydia"
    var myCharValue = 'D'
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

    //with numeric operators, the operands must be of the same type!!
    if (integerNumber >= 10) println("the number is not single digit")
    else if (integerNumber > 0) println("it's a single-digit number")
    else if (integerNumber == 0) println("number is zero")
    else println("negative number")
    // logical operators are as usual ! && ||
    val isActive = true
    val textVariable = if (!isActive) "the user is not active" else 3
    println(textVariable)


}
