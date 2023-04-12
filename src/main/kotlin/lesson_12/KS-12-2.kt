package lesson_12

fun main() {

    val dayOne = WeatherConditionWithConstructor(
        12,
        15,
        true,
        800
    )
    val dayTwo = WeatherConditionWithConstructor(
        42,
        -15,
        false,
        900)

    val dayThree = WeatherConditionWithConstructor(
        35,
        15,
        false,
        760
    )

    dayOne.pritnWeatherCondition()
    dayTwo.pritnWeatherCondition()
    dayThree.pritnWeatherCondition()

}

class WeatherConditionWithConstructor(
    _temperatureDay: Int,
    _temperatureNight: Int,
    _rain: Boolean,
    _atmosphericPressure: Int,
) {

    var temeratureDay = _temperatureDay
    var temperatureNight = _temperatureNight
    var rain = _rain
    var atmosphericPressure = _atmosphericPressure

    fun pritnWeatherCondition() = println(
        "Температура днём: $temeratureDay \n" +
                "температура ночью: $temperatureNight \n" +
                "Был дождь: $rain \n" +
                "Атмосферное давление: $atmosphericPressure \n"
    )
}