package lesson_12

fun main() {

    val dayOne = Day(
        12,
        15,
        800,
        true,
    )
    val dayTwo = Day(
        42,
        -15,
        900,
    )
    val dayThree = Day(
        35,
        15,
        760,
    )

    dayOne.pritnWeatherCondition()
    dayTwo.pritnWeatherCondition()
    dayThree.pritnWeatherCondition()

}

class Day(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val atmosphericPressure: Int,
    val rain: Boolean = false,
) {

    fun pritnWeatherCondition() = println(
        "Температура днём: $temperatureDay \n" +
                "температура ночью: $temperatureNight \n" +
                "Атмосферное давление: $atmosphericPressure \n" +
                "Был дождь: $rain \n"
    )
}