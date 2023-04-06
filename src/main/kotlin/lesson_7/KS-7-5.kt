package lesson_7

fun main() {

    val passwordNumber: IntRange = 0..9
    val passwordCharLower: CharRange = 'a'..'z'
    val passwordCharCapital: CharRange = 'A'..'Z'
    var passwordFull = ""

    println("Введите длину генерируемого пароля: ")
    val passwordLenght = readln().toInt()

    for (i in 1..passwordLenght) {
        when ((1..3).random()) {
            1 -> passwordFull += passwordNumber.random()
            2 -> passwordFull += passwordCharLower.random()
            3 -> passwordFull += passwordCharCapital.random()
        }
    }

    println(passwordFull)

}