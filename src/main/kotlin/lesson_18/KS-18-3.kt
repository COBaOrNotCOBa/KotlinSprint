package lesson_18

fun main() {

    val fox = Fox("Алиса")
    val dog = Dog("Скуби")
    val cat = Cat("Зуксель")

    fox.animalEating()
    dog.animalEating()
    cat.animalEating()
    fox.animalPlaing()
    cat.animalSleep()

}

abstract class TamogochiAnimal(val name: String, val eat: String) {
    abstract fun animalEating()
    abstract fun animalSleep()
    abstract fun animalPlaing()
}

class Fox(name: String) : TamogochiAnimal(name, eat = "ягоды") {
    override fun animalEating() = println("$name ест $eat")
    override fun animalSleep() = println("$name спит")
    override fun animalPlaing() = println("$name играет")
}

class Dog(name: String) : TamogochiAnimal(name, eat = "кости") {
    override fun animalEating() = println("$name ест $eat")
    override fun animalSleep() = println("$name спит")
    override fun animalPlaing() = println("$name играет")
}

class Cat(name: String) : TamogochiAnimal(name, eat = "рыбу") {
    override fun animalEating() = println("$name ест $eat")
    override fun animalSleep() = println("$name спит")
    override fun animalPlaing() = println("$name играет")
}