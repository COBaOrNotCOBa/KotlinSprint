package lesson_10

fun main() {

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (lenghtCheck(login) || lenghtCheck(password)) println("Логин или пароль недостаточно длинные")

}

fun lenghtCheck(string: String) = (string.count() < 4)
