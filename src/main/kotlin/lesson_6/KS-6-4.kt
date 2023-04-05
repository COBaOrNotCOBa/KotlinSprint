package lesson_6

fun main() {

    val desiredNumber = (1..9).random()
    var attempt = 5
    var userNumber: Int

    do {
        attempt--
        println("Угадай число от 1 до 9")
        userNumber = readln().toInt()
        if (desiredNumber == userNumber) break
    } while (attempt > 0)

    if (desiredNumber == userNumber) println("Это была великолепная игра!")
    else println("Было загадано число $desiredNumber")

}