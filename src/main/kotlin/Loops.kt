fun loops1(){
    repeat(3){ println("Reima") }
    var c = 0
    while(c < 3){
        println("Reima")
        c++
    }
    for (i in 1..3 ){  println("Reima") }
}

fun loops2(){
    for(i in 1..10) {
        println(i)
    }
    repeat(10){
        println(it+1)
    }
}

fun loops4(){
    var num: Int = 0

    while(num >= 0){
        num = readln().toInt()
    }
}

fun loops5(){
    var num: Int = readln().toInt()
    var sum: Int = 0

    for(i in 0 until num){
        sum += readln().toInt()
    }

    println(sum)
}

fun loops6(){
    for (i in 1..9){
        for (a in 1..9){
            print("$i*$a ")
        }
        println()
    }
}

fun loops7(){
    //elvis expression to avoid null returns
    println("Give big value:")
    val big: Int = readln().toInt()
    println("Give small value:")
    val small: Int = readln().toInt()

    for(i in big downTo small step 3){
        print("$i ")
    }
}

