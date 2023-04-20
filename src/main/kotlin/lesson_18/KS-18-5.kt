package lesson_18

fun main() {

    val screen = Screen()
    val circle = Circle()
    val square = Square()
    val point = Point()

    screen.draw(300, 400.5f, circle)
    screen.draw(100.5f, 200, square)
    screen.draw(10, 20.5f, point)
}

abstract class Shape(val nameOfShape: String)

class Circle() : Shape(nameOfShape = "Круг")
class Square() : Shape(nameOfShape = "Квадрат")
class Point() : Shape(nameOfShape = "Точка")

class Screen {

    fun draw(x: Number, y: Number, shape: Circle) =
        println("Рисуем в кординатах x=$x y=$y фигуру ${shape.nameOfShape}")

    fun draw(x: Number, y: Number, shape: Square) =
        println("Рисуем в кординатах x=$x y=$y фигуру ${shape.nameOfShape}")

    fun draw(x: Number, y: Number, shape: Point) =
        println("Рисуем в кординатах x=$x y=$y фигуру ${shape.nameOfShape}")
}