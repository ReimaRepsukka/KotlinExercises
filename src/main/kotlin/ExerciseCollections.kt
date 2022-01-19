fun exerciseCollections(){
    val numbers: MutableList<Int> = mutableListOf(1,2,3,4,5)
    numbers.add(7)
    numbers.add(0,-1)
    numbers[0] = 0
    numbers.add(6, 6)

    for (num in numbers){
        println(num)
    }
}

fun exerciseMapCollection(){
    val users: MutableMap<Int, String> = mutableMapOf()


    repeat(5){
        println("Give the id")
        val id: Int = readln().toInt()
        println("Give the nickname")
        val nickname: String = readln()

        users[id] = nickname
    }

    for (u in users){
        println(u.value)
    }
}