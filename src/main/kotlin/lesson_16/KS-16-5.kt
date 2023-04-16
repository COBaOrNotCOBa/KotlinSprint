package lesson_16

fun main() {

    val COBa = Player16_5(
        "COBa",
        100,
        999,
    )

    COBa.getDamage(99)
    COBa.getHeal(1)
    COBa.getHeal(1)
    COBa.getHeal(1)
    COBa.getHeal(1)
    COBa.getDamage(10)
    COBa.getHeal(999)

}

class Player16_5(
    private val name: String,
    private var health: Int,
    private var powerDamage: Int,
) {
    fun getDamage(incomingDamage: Int) {
        if (health > 0) {
            health -= incomingDamage
            println(
                "-$incomingDamage HP\n" +
                        "Текущее количество жизней: $health"
            )
            if (health <= 0) death()
        }
    }

    fun getHeal(incomingHeal: Int) {
        if (health > 0) {
            health += incomingHeal
            println(
                "+$incomingHeal HP\n" +
                        "Текущее количество жизней: $health"
            )
        } else println("Лечение действует только на живых")
    }

    private fun death() {
        powerDamage = 0
        health = 0
        println("$name погиб")
    }
}