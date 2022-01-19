fun exerciseLambda(){
    val numbers = listOf<Int>(3,5,3,-2,4,-2,-6, 6, -7,-3)

   // numbers.forEach{ println(it) }

    val opposites = numbers.map { -it }

    val filtered = numbers.filter { it in 0..10 }

    filtered.forEach{ println(it) }

    val persons = listOf<Person>(
        Person(0, "Reima"),
        Person(1, "Lisa"),
        Person(3, "John")
    )

    println("Give user id")
    val id = readln().toInt()
    println("Give new name for user")
    val name = readln()

    val modified = persons.map { person ->
        if(person.id == id){
            person.name = name
        }
        person
    }


}

data class Person(var id: Int, var name: String)
