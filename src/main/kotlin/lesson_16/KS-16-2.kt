package lesson_16

fun main() {

    val circle = Circle(5.0)

    circle.circle()
    circle.square()

}

private class Circle(
    private val radius: Double,
) {
    private val pi = 3.14

    fun circle() = println("Окружность круга равно: ${2 * pi * radius}")

    fun square() = println("Площадь круга равна: ${pi * radius * radius}")
}