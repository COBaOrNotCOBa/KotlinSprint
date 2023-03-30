package lesson_2

import kotlin.math.pow

fun main() {

    val deposit: Int = 70000
    val interestRate: Float = 16.7f
    val year: Byte = 20
    //val capitalization: Short = 365
    //val dayInYear: Short = 365

    val depositResult: Double
    depositResult = deposit * (1 + interestRate / 100.0).pow(year.toDouble())
    //depositResult = deposit.toDouble() * (1.0 + interestRate.toDouble() / 100.0).pow(year.toDouble())
    //depositResult = deposit.toDouble()*(1.0+interestRate.toDouble()/100.0*capitalization.toDouble()/dayInYear.toDouble()).pow(year.toDouble())

    println(String.format("%.3f", depositResult))
}