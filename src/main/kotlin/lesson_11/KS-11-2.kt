package lesson_11

fun main() {

    val user = UserAdvanced(
        1,
        "Batman",
        "123",
        "ya@mail.ru"
    )

    user.writeBio()
    user.passwordChanging()
    user.userInformation()
    user.textToSendUser("kipasa muchacho")

}

class UserAdvanced(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String? = null
) {
    fun userInformation() {
        println("id: $id")
        println("login: $login")
        println("password: $password")
        println("email: $eMail")
        if (bio != "") println("О себе: $bio")
    }

    fun writeBio() {
        println("Введите информацио о себе")
        bio = readln()
    }

    fun passwordChanging() {
        println("Введите текущий пароль: ")
        if (password == readln()) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменён")
        } else println("Введён неверный пароль")
    }

    fun textToSendUser(text: String) = println("Уважаемый $login вам сообщение: \"$text\" отправлено на почту $eMail")

}