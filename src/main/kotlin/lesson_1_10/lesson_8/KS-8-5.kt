package lesson_1_10.lesson_8

fun main() {

    println("Введите из скольки элементов будем создавать массив: ")
    val massiveSize = readln().toInt()

    val userMassive = Array(massiveSize, { "" })

    for (i in 0 until massiveSize) {
        println("Введите ${i + 1} элемент массива")
        userMassive[i] = readln()
    }

    for (i in 0 until massiveSize) println(userMassive[i])

}