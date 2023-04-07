package lesson_7

fun main() {

    val smsCode: IntRange = 1000..9999
    var currentCode: Int
    var userCode: Int

    do {
        currentCode = smsCode.random()
        println("Ваш код авторизации: $currentCode")
        println("Введите ваш код авторизации: ")
        userCode = readln().toInt()
    } while (userCode != currentCode)

    println("Добро пожаловать!")

}