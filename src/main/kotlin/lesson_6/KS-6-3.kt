package lesson_6

fun main() {

    println("Введите сколько секунд нужно засечь: ")
    val seconds = readln().toInt()
    var counter = seconds

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}