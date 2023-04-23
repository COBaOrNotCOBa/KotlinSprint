package lesson_19

fun main() {

    val starShip = StarShip()

    println(starShip.takeOff())
    println(starShip.landing())
//    println(starShip.shootingAsteroids())

}

class StarShip {
    fun takeOff() = "Взлетает"

    fun landing() {
//        TODO("need more information for logic")
    }

    fun shootingAsteroids() {
        TODO("NotImplementedError")
    }
}