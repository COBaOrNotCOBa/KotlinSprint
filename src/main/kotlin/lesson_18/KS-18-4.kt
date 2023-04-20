package lesson_18

fun main() {

    val cube = Cube18_4(5.0)
    val parallelepiped = Parallelepiped18_4(
        2.0,
        3.0,
        5.0,
    )

    println("Площадь поверхности куба равна: ${cube.squareOfFigure()}")
    println("Площадь поверхности параллепипеда равна: ${parallelepiped.squareOfFigure()}")

}

abstract class Package18_4 {
    abstract fun squareOfFigure(): Double

}

class Cube18_4(val length: Double) : Package18_4() {
    override fun squareOfFigure() = 6 * length * length
}

class Parallelepiped18_4(
    val length: Double,
    val width: Double,
    val heigth: Double,
) : Package18_4() {
    override fun squareOfFigure() = 2 * (length * width + width * heigth + heigth * length)

}