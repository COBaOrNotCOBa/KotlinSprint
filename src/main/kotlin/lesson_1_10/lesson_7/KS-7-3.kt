package lesson_1_10.lesson_7

fun main() {

    println("Введите число до которого показать все чётные числа")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) println(i)

}