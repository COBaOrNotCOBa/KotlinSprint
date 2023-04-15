package lesson_1_10.lesson_10

fun main() {

    println("Введите логин")
    val login = readln()

    lengthCheck(login)
    authorization(login, passwordGenerator())
    smsCode()
    println("Добро пожаловать! Вы авторизовались!")

}

fun lengthCheck(string: String) = (string.count() < 4)

fun passwordGenerator(): String {
    val passwordChar: CharRange = '!'..'`'
    var passwordFull = ""

    for (i in 1..5) passwordFull += passwordChar.random()
    println("Ваш пароль: $passwordFull")
    return passwordFull
}

fun authorization(userLogin: String, userPassword: String) {

    var login: String
    var password: String

    do {
        println("Введите ваш логин: ")
        login = readln()
    } while (login != userLogin)

    do {
        println("Введите ваш пароль: ")
        password = readln()
    } while (password != userPassword)

}

fun smsCode() {
    val smsCode: IntRange = 1000..9999
    var currentCode: Int
    var userCode: Int

    do {
        currentCode = smsCode.random()
        println("Ваш код авторизации: $currentCode")
        println("Введите ваш код авторизации: ")
        userCode = readln().toInt()
    } while (userCode != currentCode)

}

