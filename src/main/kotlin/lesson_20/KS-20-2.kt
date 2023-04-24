package lesson_20

fun main() {

    val player = Player20_2(
        "COBa",
        5,
        10,
    )

    println("Игрок ${player.name}, здоровье ${player.currentHealth}/${player.maximumHealth}")
    player.currentHealth = player.takeHealthPotion()
    println("Игрок ${player.name}, здоровье ${player.currentHealth}/${player.maximumHealth}")

}

class Player20_2(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int,
) {
    val takeHealthPotion: () -> Int = fun(): Int = maximumHealth
}