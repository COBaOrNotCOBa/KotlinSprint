package lesson_1_10.lesson_2

import java.time.LocalTime

fun main() {

    val departureTime = LocalTime.parse("09:39")
    val minutes: Int = departureTime.hour * 60 + departureTime.minute
    val travelTime: Int = 457
    val arrivalTimeHour: Int
    val arrivalTimeMinute: Int
    val arrivalTime: String

    arrivalTimeHour = (minutes + travelTime) / 60
    arrivalTimeMinute = (minutes + travelTime) % 60
    arrivalTime = String.format("%02d:%02d", arrivalTimeHour, arrivalTimeMinute)

    println("Вермя прибытия $arrivalTime")

}