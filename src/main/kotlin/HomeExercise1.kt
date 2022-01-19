import kotlin.system.exitProcess

fun mainStartup(){
    println("Give decimal number 1:")
    val num1: Double = readln().toDouble()
    println("Give decimal number 2:")
    val num2: Double = readln().toDouble()

    if(num1 < 0 || num2 < 0){
        exitProcess(0)
    }

    println("1 Calculate sum")
    println("2 Calculate multiplication")
    val selection: Int = readln().toInt()

    when(selection){
        1 ->{
            val result = sum(num1,num2)
            println( result )
        }
        2 ->  println(multip(num1,num2))
    }

    println("Factorial is ${factorial(3u)}")
}

fun sum(num1: Double, num2: Double): Double{
    return num1+num2
}

fun multip(num1: Double, num2: Double):Double{
    return num1*num2;
}

fun factorial(number: UInt): UInt{

    var result: UInt = 1u

    for (i in number downTo 2u){
        result *= i
    }

    return result
}