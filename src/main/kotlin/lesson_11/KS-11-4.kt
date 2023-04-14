package lesson_11

fun main() {

    val contact = Contact(
        "Mouse Face",
        "First Name",
        "Second Name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru",
        listOfFavoriteContact = listOf(
            FavoriteContact("username"),
            FavoriteContact("username"),
            FavoriteContact("username"),
        )
    )
}

class FavoriteContact(favoriteContact: String)

class Contact(
    val avatar: String,
    val firstName: String,
    val secondName: String,
    val mobileNumber: String,
    val homeNumber: String,
    val iCloud: String,
    val listOfFavoriteContact: List<FavoriteContact>
) {

    fun changeAvater() = println("Текущий аватар $avatar, на что будем менять?")
    fun sendMessage() = println("Напиши сообщение для $firstName $secondName. На номер $mobileNumber")

    fun call() = println("Звонок $firstName $secondName. На номер $mobileNumber")

    fun videoCall() = println("Видео звонок $firstName $secondName. На номер $mobileNumber")

    fun sendEmail() = println("Напиши сообщение для $firstName $secondName. На электронный адрес $iCloud")

    fun callFaceTime() = println("Используя FaceTime звонок $firstName $secondName. На номер $mobileNumber")

    fun videoCallFaceTime() = println("Используя FaceTime видео звонок $firstName $secondName. На номер $mobileNumber")
}