package lesson_1_10.lesson_7

fun main() {

    println("Введите сколько секунд нужно засечь: ")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }

    println("Время вышло")

}