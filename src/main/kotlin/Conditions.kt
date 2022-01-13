fun conditions1(){
    val n1:Int = 5
    val n2:Int = 7

    if(n1>n2){
        println("Number 1 with value $n1 is bigger")
    }else if(n1<n2){
        println("Number 2 with value $n2 is bigger")
    }else{
        println("Numbers are equal")
    }

    //And different way using return values
    println(
        if(n1>n2) "Number 1 with value $n1 is bigger"
        else if(n2<n1) "Number 2 with value $n2 is bigger"
        else "Numbers are equal"
    )

}

fun conditions2(){
    println("Type your age:")
    val age: Int = readln().toInt()

    if(age < 18){
        println("You're child")
    }else{
        println("You're adult")
    }
}

fun conditions3(){
    val n: Int = 1

    when(n){
        1 -> print("one")
        2 -> print("two")
        3 -> print("three")
        else -> print("unknown number")
    }
}

fun conditions4(){
    val selection: String = readln()

    when(selection){
        "yes" -> println("Let's continue")
        "no" -> println("Shutting down")
    }
    //Same with one print (when return so mandatory else)
    println(
        when(selection){
            "yes" -> "Let's continue"
            "no" -> "Shutting down"
            else -> ""
        }
    )
}

fun conditions5(){
    val n: Int = 1

    if(n in 0..100){
        when(n){
            1 -> print("one")
            2 -> print("two")
            3 -> print("three")
            else -> print("unknown number")
        }
    }
}

fun conditions6(){
    println("How many children you have?")
    val children: Int = readln().toInt()

    when(children){
        1,2,3 -> println("Average family")
        else -> {
            if(children<1)
                println("No children")
            else
                println("Big family")
        }
    }
}

fun conditions7(){
    println("What is your bank account balance?")
    var balance: Double = readln().toDouble()

    if(balance<10){
        println("Do you want to take loan? (y/n)")
        val takeLoan: String = readln()
        if(takeLoan == "y"){
            println("How much loan?")
            balance += readln().toDouble()
        }
    }

    println("Balance is now $balance euros.")
}