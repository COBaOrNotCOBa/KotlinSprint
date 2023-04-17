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

interface MovementOnWater {
    fun movementOnWater()
}

interface MovementOnAir {
    fun movementOnAir()
}

class CrucianCarp() : MovementOnWater {
    override fun movementOnWater() {
        println("Карп плывёт")
    }
}

class Seagull() : MovementOnWater, MovementOnAir {
    override fun movementOnWater() {
        println("Чайка плывет")
    }

    override fun movementOnAir() {
        println("Чайка летит")
    }
}

class Duck() : MovementOnWater, MovementOnAir {
    override fun movementOnWater() {
        println("Утка плавет")
    }

    override fun movementOnAir() {
        println("Утка летит")
    }
}