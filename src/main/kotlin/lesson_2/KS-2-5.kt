package lesson_2

import kotlin.math.pow

fun main() {

    val deposit: Int = 70000
    val interestRate: Float = 16.7f
    val year: Int = 20

    val depositResult: Double
    depositResult = deposit * (1 + interestRate / 100.0).pow(year)

    println(String.format("%.3f", depositResult))
}