fun variables1_2(){
    val num1: Int = 5
    val num2: Int = 6

    println("Sum is ${num1+num2}")
    println("Multiplication is ${num1*num2}")
    println("Difference is ${num1-num2}")
    println("Division is ${num1.toDouble()/num2}")

}

fun variables3(){
    var num1: Int = 5
    var num2: Int = 6

    println("Sum is ${num1+num2}")
    println("Multiplication is ${num1*num2}")
    println("Difference is ${num1-num2}")
    println("Division is ${num1.toDouble()/num2}")
}

fun variables4(){
    val text: String? =""

    val len: Int? = text?.length
    println(text?.length)

    //Null pointer exception version
    val len2: Int = text!!.length
    println(text!!.length)
}