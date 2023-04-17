package lesson_15

fun main() {

    var sumPassenger = 0

    val carOne = PassengerCar(3)
    val carTwo = PassengerCar(2)
    val truck = Truck(1, 2000.0)

    carOne.movement()
    carOne.passengerCounter()
    sumPassenger += carOne.passanger

    carTwo.movement()
    carTwo.passengerCounter()
    sumPassenger += carTwo.passanger

    truck.movement()
    truck.passengerCounter()
    sumPassenger += truck.passanger
    truck.cargoVolume()

    println()
    println("Всего перевезено пассажиров: $sumPassenger")
    println("Всего перевезено грузов весом: ${truck.cargo}")

}

interface CarMovement {
    fun movement() = println("Автомобиль едет")
}

interface CarPassengerCounter {
    fun passengerCounter()
}

interface CarCargoVolume {
    fun cargoVolume()
}

abstract class CarToslo(val passanger: Int) : CarMovement, CarPassengerCounter

class PassengerCar(passanger: Int) : CarToslo(passanger) {
    override fun passengerCounter() = println("Легковой автомобиль перевёз пассажиров: $passanger")
}

class Truck(passanger: Int, val cargo: Double) : CarToslo(passanger), CarCargoVolume {
    override fun passengerCounter() = println("Грузовик перевёз пассажиров: $passanger")
    override fun cargoVolume() = println("Грузовик перевёз груз весом: $cargo")
}