package lesson_14

fun main() {

    val listOfSatellite = listOf(
        Satellite(
            "Of",
            false,
            false,
            false,
            true,
        ), Satellite(
            "Domino",
            true,
            false,
            false,
            false,
        )
    )

    val planet = Planet(
        "Destiny",
        true,
        false,
        true,
        true,
        listOfSatellite,
    )

    planet.nameOfCelestialBody()

}

abstract class CelestialBody(
    val name: String,
    val inhabited: Boolean,
    val atmosphere: Boolean,
    val water: Boolean,
    val suitableForDisembarkation: Boolean,
)

class Satellite(
    name: String,
    inhabited: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForDisembarkation: Boolean,
) : CelestialBody(name, inhabited, atmosphere, water, suitableForDisembarkation)

class Planet(
    name: String,
    inhabited: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForDisembarkation: Boolean,
    val listOfSatellite: List<Satellite>,
) : CelestialBody(name, inhabited, atmosphere, water, suitableForDisembarkation) {
    fun nameOfCelestialBody() {
        println("Название планеты: $name")
        println("Список спутников планеты:")
        listOfSatellite.forEach {
            println("${it.name}")
        }
    }
}