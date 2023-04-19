package lesson_18

fun main() {

    val diceRoll4 = DiceRollFourFaces()
    val diceRoll6 = DiceRollSixFaces()
    val diceRoll8 = DiceRollEigthFaces()

    diceRoll4.faceOfDiceRoll()
    diceRoll6.faceOfDiceRoll()
    diceRoll8.faceOfDiceRoll()

}

open class DiceRoll18_2 {
    open fun faceOfDiceRoll() = println("")
}

class DiceRollFourFaces : DiceRoll18_2() {
    val diceRollRange = 1..4
    override fun faceOfDiceRoll() = println(diceRollRange.random())

}

class DiceRollSixFaces() : DiceRoll18_2() {
    val diceRollRange = 1..6
    override fun faceOfDiceRoll() = println(diceRollRange.random())
}

class DiceRollEigthFaces() : DiceRoll18_2() {
    val diceRollRange = 1..8
    override fun faceOfDiceRoll() = println(diceRollRange.random())
}