package lesson_1

fun main() {

    val seconds: Short = 6480

    val min: Int
    val secondsLeft: Int

    secondsLeft = seconds % 60
    min = seconds / 60

    println(String.format("%02d:%02d", min, secondsLeft))

}