package lesson_11

fun main() {

    val contakt = Contakt(
        "Mouse Face",
        "First Name",
        "Second Name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru"
    )

}

class Contakt(
    val avatar: String,
    val firstName: String,
    val secondName: String,
    val mobileNumber: String,
    val homeNumber: String,
    val iCloud: String,
) {
    val favoriteContaktOne = "userName"
    val favoriteContaktTwo = "userName"
    val favoriteContaktThree = "userName"

    fun changeAvater() = println("Текущий аватар $avatar, на что будем менять?")
    fun sendMessage() = println("Напиши сообщение для $firstName $secondName. На номер $mobileNumber")

    fun call() = println("Звонок $firstName $secondName. На номер $mobileNumber")

    fun videoCall() = println("Видео звонок $firstName $secondName. На номер $mobileNumber")

    fun sendEmail() = println("Напиши сообщение для $firstName $secondName. На электронный адрес $iCloud")

    fun callFaceTime() = println("Используя FaceTime звонок $firstName $secondName. На номер $mobileNumber")

    fun videoCallFaceTime() = println("Используя FaceTime видео звонок $firstName $secondName. На номер $mobileNumber")
}