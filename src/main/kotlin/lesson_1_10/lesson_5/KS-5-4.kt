package lesson_1_10.lesson_5

fun main() {

    val userName = "Batman"
    val userPassword = "password"

    println("Введите логин: ")
    val writeName = readLine()

    val result = if (userName != writeName) "Такой логин не зарегистрирован. Вы можете пройти регистрацию"
    else {
        println("Введите пароль: ")
        val writePassword = readLine()
        if (userPassword == writePassword) "Welcome!"
        else "Введён не верный пароль ;("
    }

    println(result)

}