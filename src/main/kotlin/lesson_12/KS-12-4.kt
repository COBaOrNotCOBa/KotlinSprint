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
}

class Day(
    temperatureDay: Int,
    temperatureNight: Int,
    atmosphericPressure: Int,
    rain: Boolean = false,
) {

    init {
        println(
            "Температура днём: $temperatureDay \n" +
                    "температура ночью: $temperatureNight \n" +
                    "Атмосферное давление: $atmosphericPressure \n" +
                    "Был дождь: $rain \n"
        )
    }
}