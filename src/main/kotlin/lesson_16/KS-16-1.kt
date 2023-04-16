package lesson_16

fun main() {

    val diceRoll = DiceRollWithOneRandomNumber()

    diceRoll.printDiceRollRandomNumber()

}

class DiceRollWithOneRandomNumber {

    private fun getRandomNumber(): String {
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
        val changeNumber = (0..5).random()
        val randomNumber: Int = (1..999).random()
        var result = ""

        numbers[changeNumber] = randomNumber
        numbers.forEach {
            result += it.toString() + " "
        }
        return result
    }

    fun printDiceRollRandomNumber() {
        println(getRandomNumber())
    }
}