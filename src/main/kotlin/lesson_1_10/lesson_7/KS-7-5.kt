package lesson_1_10.lesson_7

fun main() {

    val passwordNumber: IntRange = 0..9
    val passwordCharLower: CharRange = 'a'..'z'
    val passwordCharCapital: CharRange = 'A'..'Z'
    val allSymbols = passwordNumber + passwordCharLower + passwordCharCapital
    var passwordFull = ""

    println("Введите длину генерируемого пароля: ")
    val passwordLenght = readln().toInt()

    for (i in 1..passwordLenght) passwordFull += allSymbols.random()

    println(passwordFull)

}