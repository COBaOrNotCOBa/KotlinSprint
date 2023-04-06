package lesson_7

fun main() {

    val passwordNumber: IntRange = 0..9
    val passwordChar: CharRange = 'a'..'z'
    val count = 6
    var passwordFull = ""

    for (i in 1..count) {
        if (i % 2 == 0) passwordFull += passwordNumber.random()
        else passwordFull += passwordChar.random()
    }

    println(passwordFull)

}