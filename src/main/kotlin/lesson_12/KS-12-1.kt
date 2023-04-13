package lesson_12

fun main() {

    val dayOne = WeatherCondition()
    val dayTwo = WeatherCondition()

    dayOne.temeratureDay = 22
    dayOne.temperatureNight = 10
    dayOne.rain = true
    dayOne.atmosphericPressure = 750

    dayOne.temeratureDay = 32
    dayOne.temperatureNight = 15

    dayOne.pritnWeatherCondition()
    dayTwo.pritnWeatherCondition()

}
class WeatherCondition {

    var temeratureDay = 15
    var temperatureNight = 5
    var rain = false
    var atmosphericPressure = 760

    fun pritnWeatherCondition() = println(
        "Температура днём: $temeratureDay \n" +
                "температура ночью: $temperatureNight \n" +
                "Был дождь: $rain \n" +
                "Атмосферное давление: $atmosphericPressure \n"
    )
}