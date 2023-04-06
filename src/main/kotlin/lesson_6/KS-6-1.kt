package lesson_6

fun main() {

    var login: String
    var password: String

    println("Необходимо пройти регистрацию")
    println("Придумайте логин: ")
    val userLogin = readln()
    println("Придумайте пароль: ")
    val userPassword = readln()

    println("Введите ваш логин: ")
    login = readln()
    while (login != userLogin) {
        println("Введите ВАШ логин: ")
        login = readln()
    }

    do  {
        println("Введите ваш пароль: ")
        password = readln()
    } while (password != userPassword)

    if (password == userPassword) println("Авторизация прошла успешно")

}