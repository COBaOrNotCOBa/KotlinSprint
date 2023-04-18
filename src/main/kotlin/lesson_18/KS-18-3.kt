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

open class TamogochiAnimal(val name: String,val eat : String) {
    fun animalEating() = println("$name ест $eat")
    fun animalSleep() = println("$name спит")
    fun animalPlaing() = println("$name играет")
}

class Fox(name: String) : TamogochiAnimal(name, eat = "ягоды")
class Dog(name: String) : TamogochiAnimal(name, eat = "кости")
class Cat(name: String) : TamogochiAnimal(name, eat = "рыбу")