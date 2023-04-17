package lesson_16

fun main() {

    val diceRoll = DiceRollWithOneRandomNumber()

    diceRoll.getRandomNumber()

}

class DiceRollWithOneRandomNumber {
    private val randomNumber = 1..6

    fun getRandomNumber() = println(randomNumber.random())

}