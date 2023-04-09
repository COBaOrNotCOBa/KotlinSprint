package lesson_10

fun main() {

    var humanDice: Int
    var compDice:Int
    var humanChoice: String
    var humanWins = 0

    do {
        println("Твой бросок: ")
        humanDice = diceRoll()
        println("Компьютерный бросок")
        compDice = diceRoll()

    when {
        humanDice == compDice -> println("Это был равный бой!")
        humanDice > compDice -> {
            println("Победило человечество")
            humanWins++
        }
        humanDice < compDice -> println("Победила машина")
    }

        println("Хотите бросить кости еще раз Введите Да или Нет: ")
        humanChoice = readln()

    } while (humanChoice=="Да")

    println("Количество побед у человечества: $humanWins")

}

fun diceRoll(): Int {
    val firstDice = (1..6).random()
    println("На первом кубике: $firstDice")
    val secondDice = (1..6).random()
    println("На втором кубике: $secondDice")
    return firstDice + secondDice
}