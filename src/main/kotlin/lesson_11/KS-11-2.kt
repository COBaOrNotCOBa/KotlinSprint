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