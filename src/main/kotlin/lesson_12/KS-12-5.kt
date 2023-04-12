package lesson_12

fun main() {

    val listOfDays = mutableListOf<Day>()
    val listOfRainCondition = listOf(false, true)
    val countDays = 10
    var countOfRainyDays: Int

    for (i in 0 until countDays) listOfDays.add(
        Day(
            (-20..40).random(),
            (-30..25).random(),
            (700..800).random(),
            listOfRainCondition.random(),
        )
    )

    var averageTemperatureDay = listOfDays[0].temperatureDay
    var averageTemperatureNight = listOfDays[0].temperatureNight
    var averageAtmosphericPressure = listOfDays[0].atmosphericPressure
    if (listOfDays[0].rain) countOfRainyDays = 0
    else countOfRainyDays = 1

    for (i in 0 until countDays) {
        averageTemperatureDay += listOfDays[i].temperatureDay
        averageTemperatureNight += listOfDays[i].temperatureNight
        averageAtmosphericPressure += listOfDays[i].atmosphericPressure
        if (listOfDays[i].rain) countOfRainyDays += 0
        else countOfRainyDays += 1
    }

    println("Средняя температура днём: ${averageTemperatureDay / countDays}")
    println("Средняя температура ночью: ${averageTemperatureNight / countDays}")
    println("Среднее атмосферное давление: ${averageAtmosphericPressure / countDays}")
    println("Количество дождливых дней: $countOfRainyDays")
}

class Day(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val atmosphericPressure: Int,
    val rain: Boolean = false,
)