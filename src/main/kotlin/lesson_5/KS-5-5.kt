package lesson_5

fun main() {

    val winFirstNumber = (1..100).shuffled().first().toByte()
    val winSecondNumber = (1..100).shuffled().first().toByte()

    println("Введите первое число от 1 до 100")
    val userFirstNumber = readLine()!!.toByte()
    println("Введите второе число от 1 до 100")
    val userSecondNumber = readLine()!!.toByte()

    println("Победившие номера $winFirstNumber и $winSecondNumber!")

    val result =
        if (winFirstNumber == userFirstNumber && winSecondNumber == userSecondNumber) "Поздравляем! Вы выиграли главный приз!"
        else if (winFirstNumber == userFirstNumber || winSecondNumber == userSecondNumber) "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"

    println(result)
}