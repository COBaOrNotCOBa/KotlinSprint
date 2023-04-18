package lesson_18

fun main() {

    Package18_4().squareOfFigure(5.0)
    Package18_4().squareOfFigure(listOf(2.0, 3.0, 5.0))

}

class Package18_4() {
    fun squareOfFigure(
        length: Double,
    ) {
        println("Площадь куба равна: ${6 * length * length}")
    }
    fun squareOfFigure(
        length: List<Double>,
    ) {
        println(
            "Площадь параллелепипеда равна: " +
                    "${2 * (length[0] * length[1] + length[1] * length[2] + length[2] * length[0])}"
        )
    }
}