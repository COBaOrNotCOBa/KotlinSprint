package lesson_20

fun main() {

    val name = "COBa"
    val splashScreen = { username: String ->
        println("С наступающим Новым Годом, $username!")
    }
    splashScreen(name)

}