package lesson_1_10.lesson_10

fun main() {

    var humanChoice: String
    var humanWins = 0

    do {
        humanWins=round(humanWins)
        println("Хотите бросить кости еще раз Введите Да или Нет: ")
        humanChoice = readln()
    } while (humanChoice == "Да")

    println("Количество побед у человечества: $humanWins")

}

fun diceRoll(): Int {
    val firstDice = (1..6).random()
    println("На первом кубике: $firstDice")
    val secondDice = (1..6).random()
    println("На втором кубике: $secondDice")
    return firstDice + secondDice
}

fun round(humanWins : Int):Int{
    var humanVictory = humanWins

    println("Твой бросок: ")
    val humanDice = diceRoll()
    println("Компьютерный бросок")
    val compDice = diceRoll()

    when {
        humanDice == compDice -> println("Это был равный бой!")
        humanDice > compDice -> {
            println("Победило человечество")
            humanVictory++
        }
        else -> println("Победила машина")
    }

    return humanVictory
}