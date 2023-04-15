package lesson_1_10.lesson_4

fun main() {

    val weather = true
    val tent = true
    val humidity = 20f
    val season = "winter"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(weather == LEGUMES_WEATHER) && (tent == LEGUMES_TENT) && (humidity == LEGUMES_HUMIDITY) && (season != LEGUMES_SEASON)}"
    )

}

const val LEGUMES_WEATHER = true
const val LEGUMES_TENT = true
const val LEGUMES_HUMIDITY = 20f
const val LEGUMES_SEASON = "winter"