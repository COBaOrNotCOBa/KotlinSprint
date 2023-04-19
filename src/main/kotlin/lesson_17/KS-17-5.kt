package lesson_17

fun main() {

    val user = User17_5("COBa")

    user.password = "1245"
    println(user.password)
    user.login = "Put"
    user.password = "45"
    println(user.password)
    user.login = "COBa"

}

class User17_5(login: String) {
    var login: String = login
        set(value) {
            println("Логин успешно изменён на $value")
            field = value
        }
    var password: String = "123"
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

}