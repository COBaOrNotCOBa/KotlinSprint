package lesson_14

fun main() {

    val ship = Ship1(
        "Voyash",
        500,
        500.0,
    )

    ship.shipSpeed1()
    ship.shipLoadCapacity1()

}

class Ship1(
    val name: String,
    val speed: Int,
    val loadCapacity: Double,
    val icebreaker: Boolean = false,
) {

    fun shipSpeed1() = println("${name} движется со скоростью ${speed}")

    fun shipLoadCapacity1() = println("${name} максимульная вместимость ${loadCapacity}")
}