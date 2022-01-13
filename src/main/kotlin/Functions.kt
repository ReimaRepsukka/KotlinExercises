fun funcExercises(){
    //Exercise 1
    task1("Reima Riihimäki")

    //Exercise 2
    val len: Int = task2("Hello world!")

    //Exercise 3
    val biggest = task3(4u,5u,6u);
    val biggest2 = task3(5u,12u)

    //Exercise 4
    val personText = task4("JJ", "James", 34)
    val personText2 = task4(name = "Liz", age = 25)
    println(personText)
    println(personText2)

}

fun task1(name: String = "John Doe"){
    println("Welcome $name!")
}

fun task2(text: String): Int{
    return text.length
}

fun task3(x: UInt = 0u, y: UInt = 0u, z: UInt = 0u) : UInt{

    //Get bigger of the first two
    var max: UInt = if(x>y) x else y

    //Return bigger of the previous bigger and z
    return if(max>z) max else z
}

fun task4(nickname: String = "unknown", name: String, age: Int): String{
    return "Welcome $name. Your age is $age and nickname $nickname."
}