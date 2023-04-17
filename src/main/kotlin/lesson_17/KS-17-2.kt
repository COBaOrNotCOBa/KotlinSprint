package lesson_17

fun main() {

    val ship = Ship17_2()
    println(ship.name)
    ship.name = "JustShip"
    println(ship.name)

}

class Ship17_2 {
    var name: String = "StarShip"
        get() = field
        set(value) {
            field = name
        }
    val averageSpeed: Int = 500
    val homePort: String = "Haiti"
}