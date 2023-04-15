package lesson_1_10.lesson_5

fun main() {

    println("Сколько будет 2+2=")
    val answer = readln().toInt()

    val access = if (answer == 4) "Добро пожаловать!"
    else "Доступ запрещен."

    println(access)
}