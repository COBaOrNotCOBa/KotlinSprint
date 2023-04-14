package lesson_14

fun main() {

    val ship = Ship2(
        "Voyash",
        500,
        500.0,
    )

    val cargo = Cargo2(
        "Cargo",
        200,
        1500.0,
    )

    val iceBreaker = Icebreaker2(
        "Icebreaker",
        350,
        350.0
    )

    cargo.shipSpeed2()
    cargo.shipLoadCapacity2()

    iceBreaker.shipSpeed2()
    iceBreaker.shipLoadCapacity2()
    iceBreaker.iceBreak2()

}

open class Ship2(
    val name: String,
    val speed: Int,
    val loadCapacity: Double,
    val icebreaker: Boolean = false,
) {

    fun shipSpeed2() = println("${name} движется со скоростью ${speed}")

    fun shipLoadCapacity2() = println("${name} максимальная вместимость ${loadCapacity}")
}

class Cargo2(
    name: String,
    speed: Int,
    loadCapacity: Double,
    val unmanned: Boolean = true
) : Ship2(name, speed, loadCapacity)

class Icebreaker2(
    name: String,
    speed: Int,
    loadCapacity: Double,
) : Ship2(name, speed, loadCapacity, icebreaker = true) {
    fun iceBreak2() = println("${name} ломает лёд: ${icebreaker}")
}