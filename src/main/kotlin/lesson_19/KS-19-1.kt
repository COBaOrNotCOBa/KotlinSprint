package lesson_19

fun main() {

    val listOfFishes = listOf(1, 2, 3, 4)

    for (i in listOfFishes) {
        when (i) {
            Fishes19_1.GUPPY.id -> fishName19_1(Fishes19_1.GUPPY)
            Fishes19_1.ANGELFISH.id -> fishName19_1(Fishes19_1.ANGELFISH)
            Fishes19_1.GOLDFISH.id -> fishName19_1(Fishes19_1.GOLDFISH)
            Fishes19_1.SIAMESE_FIGHTING_FISH.id -> fishName19_1(Fishes19_1.SIAMESE_FIGHTING_FISH)
        }
    }
}

enum class Fishes19_1(val id: Int) {
    GUPPY(1),
    ANGELFISH(2),
    GOLDFISH(3),
    SIAMESE_FIGHTING_FISH(4),
}

fun fishName19_1(fishName: Fishes19_1) {
    when (fishName) {
        Fishes19_1.GUPPY -> println("Вы можете поместить в свой аквариум рыбу гуппи")
        Fishes19_1.ANGELFISH -> println("Вы можете поместить в свой аквариум рыбу скалярия")
        Fishes19_1.GOLDFISH -> println("Вы можете поместить в свой аквариум золотую рыбку")
        Fishes19_1.SIAMESE_FIGHTING_FISH -> println("Вы можете поместить в свой аквариум рыбу петушок")
    }
}