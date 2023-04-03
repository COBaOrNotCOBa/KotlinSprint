package lesson_4

fun main() {

    val weather = "солнечная"
    val tent = "раскрыт"
    val humidity = "20"
    val season = "время года зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(weather == LEGUMES_WEATHER) && (tent == LEGUMES_TENT) && (humidity == LEGUMES_HUMIDITY) && (season != LEGUMES_SEASON)}"
    )

}

const val LEGUMES_WEATHER = "солнечная"
const val LEGUMES_TENT = "раскрыт"
const val LEGUMES_HUMIDITY = "20"
const val LEGUMES_SEASON = "время года зима"