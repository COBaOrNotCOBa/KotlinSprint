package lesson_10

fun main() {

    println("Твой бросок: ")
    val humanDice = diceRoll()
    println("Компьютерный бросок")
    val compDice = diceRoll()

    when {
        humanDice == compDice -> println("Это был равный бой!")
        humanDice > compDice -> println("Победило человечество")
        humanDice < compDice -> println("Победила машина")
    }

}

fun diceRoll(): Int {
    val firstDice = (1..6).random()
    println("На первом кубике: $firstDice")
    val secondDice = (1..6).random()
    println("На втором кубике: $secondDice")
    return firstDice + secondDice
}