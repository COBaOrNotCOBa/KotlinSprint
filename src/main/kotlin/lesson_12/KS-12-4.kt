package lesson_12

fun main() {

    val dayOne = Day4(
        12,
        15,
        800,
        true,
    )
    val dayTwo = Day4(
        42,
        -15,
        900,
    )
    val dayThree = Day4(
        35,
        15,
        760,
    )
}

class Day4(
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