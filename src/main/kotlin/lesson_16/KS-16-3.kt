package lesson_16

fun main() {

    val user = User16_3(
        "Bongo",
        "123",
    )

    if (user.checkPassword("1234")) println("Password is correct")
    else println("Password is not correct")
}

class User16_3(
    val login: String,
    private val password: String,
) {
    fun checkPassword(inputPassword: String) = (inputPassword == password)

}