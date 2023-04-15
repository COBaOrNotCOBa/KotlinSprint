package lesson_1_10.lesson_6

fun main() {

    println("Введите сколько секунд нужно засечь: ")
    val seconds = readln().toInt()
    var counter = seconds

    while (counter > 0) {
        Thread.sleep(1000)
        --counter
    }

    println("Прошло $seconds секунд")

}