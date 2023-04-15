package lesson_1_10.lesson_5

fun main() {

    val winFirstNumber = (1..100).random()
    val winSecondNumber = (1..100).random()

    println("Введите первое число от 1 до 100")
    val userFirstNumber = readln().toInt()
    println("Введите второе число от 1 до 100")
    val userSecondNumber = readln().toInt()

    println("Победившие номера $winFirstNumber и $winSecondNumber!")

    val result =
        if (winFirstNumber == userFirstNumber && winSecondNumber == userSecondNumber)
            "Поздравляем! Вы выиграли главный приз!"
        else if (winFirstNumber == userFirstNumber || winSecondNumber == userSecondNumber)
            "Вы выиграли утешительный приз!"
        else
            "Неудача! Крутите барабан!"

    println(result)
}