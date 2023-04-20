package lesson_17

fun main() {

    val ship = Ship17_2(500, "Honduras")
    println(ship.name)
    ship.name = "JustShip"
    println(ship.name)

}

class Ship17_2(val averageSpeed: Int, val homePort: String) {
    var name: String = "StarShip"
        set(value) {
            if (value != name) println("Руки проч от названия!")
        }

}