package lesson_5

fun main() {

    println("Сколько будет 2+2=")
    val answer = readLine()!!.toInt()

    val access = if (answer == 4) "Добро пожаловать!"
    else "Доступ запрещен."

    println(access)
}