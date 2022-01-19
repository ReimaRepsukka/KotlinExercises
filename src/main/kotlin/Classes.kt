import java.security.cert.PolicyNode

fun exerciseClassMain() {
    val car = object {
        var speed: Int = 80
        var brand: String = "Volvo"
    }

    println("Car brand is ${car.brand} and speed is ${car.speed}")

    val p1: Point = Point(5, 7)
    val p2: Point = Point(1, 3)

    println("(${p1.x},${p1.y})")
    println("(${p2.x},${p2.y})")

    println(p1)
    println(p2)
}

fun carExerciseMain(){
    val car1: Car = Car("Skoda", 15500.0, 100)
    val car2: Car = Car("Lada", 9000.5, 80)

    car1.throttle()

    println( car1.info() )
    println( car2.info() )

    val copyCar: Car = car2.makeCopy()
}

data class Point(val x: Int, val y: Int)

class Car(
    var brand: String,
    var prize: Double = 0.0,
    var speed: Int = 0
){
    fun throttle(){
        speed+=10
    }

    fun info(): String{
        return "Brand:$brand, Prize:$prize, Speed:$speed"
    }

    fun makeCopy(): Car{
        return Car(brand, prize, speed)
    }
}