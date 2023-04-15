package lesson_14


fun main() {

    val listOfFigeures = mutableListOf<Figure>()
    val ourColor = "Red"

    val circleOne = Circle(
        "Red",
        15.0,
    )
    val circleTwo = Circle(
        "Black",
        5.0,
    )
    val rectangleOne = Rectangle(
        "Red",
        5.0,
        10.0,
    )
    val rectangleTwo = Rectangle(
        "Green",
        5.0,
        10.0,
    )
    val triangleOne = Triangle(
        "Black",
        5.0,
        4.0,
        3.0,
        2.4,
    )
    val triangleTwo = Triangle(
        "Green",
        10.0,
        8.0,
        6.0,
        4.8,
    )

    listOfFigeures.add(circleOne)
    listOfFigeures.add(circleTwo)
    listOfFigeures.add(rectangleOne)
    listOfFigeures.add(rectangleTwo)
    listOfFigeures.add(triangleOne)
    listOfFigeures.add(triangleTwo)

    circleOne.sumOfPerimetersColorFigures(listOfFigeures, ourColor)
    circleOne.sumOfSquareColorFigures(listOfFigeures, ourColor)
}

abstract class Figure(val color: String) {

    abstract fun squareFigure(): Double

    abstract fun perimeterFigure(): Double

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