package lesson_15

fun main() {

    val carp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    carp.movementOnWater()
    seagull.movementOnWater()
    seagull.movementOnAir()
    duck.movementOnWater()
    duck.movementOnAir()

}

interface movementOnWater {
    fun movementOnWater()
}

interface movementOnAir {
    fun movementOnAir()
}

class CrucianCarp() : movementOnWater {
    override fun movementOnWater() {
        println("Карп плывёт")
    }
}

class Seagull() : movementOnWater, movementOnAir {
    override fun movementOnWater() {
        println("Чайка плывет")
    }

    override fun movementOnAir() {
        println("Чайка летит")
    }
}

class Duck() : movementOnWater, movementOnAir {
    override fun movementOnWater() {
        println("Утка плавет")
    }

    override fun movementOnAir() {
        println("Утка летит")
    }
}