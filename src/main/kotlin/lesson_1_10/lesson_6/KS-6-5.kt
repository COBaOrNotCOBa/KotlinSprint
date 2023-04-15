package lesson_1_10.lesson_6

fun main() {

    var firstUnknowNumber: Int
    var secondUnknowNumber: Int
    var userAnswer: Int
    var count = 3

    while (count > 0) {
        firstUnknowNumber = (1..9).random()
        secondUnknowNumber = (1..9).random()
        println("Сколько будет $firstUnknowNumber + $secondUnknowNumber")
        userAnswer = readln().toInt()
        if (userAnswer == firstUnknowNumber + secondUnknowNumber) {
            println("Добро пожаловать!")
            break
        }
        count--
        if (count == 0) println("Доступ запрещен")
    }

}