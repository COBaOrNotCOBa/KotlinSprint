package lesson_16

fun main() {

    val user = User16_3(
        "Bongo",
        "123",)

    user.checkPassword("345")
}

class User16_3(
    val login: String,
    private val password: String,
) {
    fun checkPassword(inputPassword: String) {
        if (inputPassword==password) println("Password is correct")
        else println("Password is not correct")
    }
}