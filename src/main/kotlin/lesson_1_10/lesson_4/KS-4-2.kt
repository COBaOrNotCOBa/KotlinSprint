package lesson_1_10.lesson_4

fun main() {

    var weight = 20
    var volume = 80
    println("Average для груза с весом $weight кг и объёмом $volume л: ${(weight >= MINIMIUM_WEIGHT) && (weight <= MAXIMUM_WEIGHT) && (volume < MAXIMUM_VOLUME)}")

    weight = 50
    volume = 100
    println("Average для груза с весом $weight кг и объёмом $volume л: ${(weight >= MINIMIUM_WEIGHT) && (weight <= MAXIMUM_WEIGHT) && (volume < MAXIMUM_VOLUME)}")

}

const val MINIMIUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_VOLUME = 100