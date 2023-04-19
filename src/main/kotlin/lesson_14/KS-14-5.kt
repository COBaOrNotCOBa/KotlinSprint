package lesson_14


fun main() {

    val listOfFigeures = listOf<Figure>(
        Circle(
            "Red",
            15.0,
        ), Circle(
            "Black",
            5.0,
        ), Rectangle(
            "Red",
            5.0,
            10.0,
        ), Rectangle(
            "Green",
            5.0,
            10.0,
        ), Triangle(
            "Black",
            5.0,
            4.0,
            3.0,
            2.4,
        ), Triangle(
            "Green",
            10.0,
            8.0,
            6.0,
            4.8,
        )
    )

    val ourColor = "Red"

    sumOfPerimetersColorFigures(listOfFigeures, ourColor)
    sumOfSquareColorFigures(listOfFigeures, ourColor)
}


fun sumOfPerimetersColorFigures(listOfFigures: List<Figure>, searchColor: String) {
    var sum = 0.0
    listOfFigures.forEach {
        if (it.color == searchColor) sum += it.perimeterFigure()
    }
    println("Сумма периметров красных фигур: $sum")
}

fun sumOfSquareColorFigures(listOfFigures: List<Figure>, searchColor: String) {
    var sum = 0.0
    listOfFigures.forEach {
        if (it.color == searchColor) sum += it.squareFigure()
    }
    println("Сумма площадей красных фигур: $sum")
}


abstract class Figure(val color: String) {

    abstract fun squareFigure(): Double

    abstract fun perimeterFigure(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun squareFigure() = 3.14 * radius * radius

    override fun perimeterFigure() = 2 * 3.14 * radius
}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure(color) {

    override fun squareFigure() = length * width

    override fun perimeterFigure() = 2 * (length + width)
}

class Triangle(
    color: String,
    val sideOne: Double,
    val sideTwo: Double,
    val sideThree: Double,
    val heigth: Double,
) : Figure(color) {

    override fun squareFigure() = 0.5 * sideOne * heigth

    override fun perimeterFigure() = sideOne + sideTwo + sideThree
}