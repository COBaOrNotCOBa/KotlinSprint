package lesson_18

fun main() {
    val screen = Screen()
    val point = Point(10, 20.5f)
    val square = Square(100.5f, 200)
    val circle = Circle(300, 400.5)

    screen.draw(point)
    screen.draw(square)
    screen.draw(circle)
}

abstract class Shape(
    val x: Number,
    val y: Number,
    val shape: String,
)

class Point(
    x: Number,
    y: Number,
) : Shape(x, y, shape = "точку")

class Square(
    x: Number,
    y: Number,
) : Shape(x, y, shape = "квадрат")

class Circle(
    x: Number,
    y: Number,
) : Shape(x, y, shape = "круг")

class Screen {

    fun draw(point: Point) {
        println("Рисуем ${point.shape} ${point.x} ${point.y}")
    }

    fun draw(square: Square) {
        println("Рисуем ${square.shape} ${square.x} ${square.y}")
    }

    fun draw(circle: Circle) {
        println("Рисуем ${circle.shape} ${circle.x} ${circle.y}")
    }
}