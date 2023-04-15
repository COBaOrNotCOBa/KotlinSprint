package lesson_1_10.lesson_10

fun main() {

    println("Твой бросок: ")
    val humanDice = diceRollOne()
    println("Компьютерный бросок")
    val compDice = diceRollOne()

    when {
        humanDice == compDice -> println("Это был равный бой!")
        humanDice > compDice -> println("Победило человечество")
        humanDice < compDice -> println("Победила машина")
    }

}

fun diceRollOne(): Int {
    val firstDice = (1..6).random()
    println("На первом кубике: $firstDice")
    val secondDice = (1..6).random()
    println("На втором кубике: $secondDice")
    return firstDice + secondDice
}