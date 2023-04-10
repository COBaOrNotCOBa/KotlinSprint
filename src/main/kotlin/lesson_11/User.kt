package lesson_11

class User(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
) {
    var bio = ""

    fun userInformation() {
        println("id: $id")
        println("login: $login")
        println("password: $password")
        println("email: $eMail")
        if (bio!="") println("О себе: $bio")
    }

    fun writeBio() {
        println("Введите информацио о себе")
        bio = readln()
    }

    fun passwordChanging(){
        println("Введите текущий пароль: ")
        if (password== readln()) {
            println("Введите новый пароль: ")
            password= readln()
            println("Пароль успешно изменён")
        } else println("Введён неверный пароль")
    }

    fun textToSendUser(text :String) = println("Уважаемый $login вам сообщение: \"$text\" отправлено на почту $eMail")

}