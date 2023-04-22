package lesson_19

fun main() {

    val tank = Tank19_4(null)

    tank.changeAmmo(Ammo19_4.BLUE_AMMO)
    tank.shoot()
    tank.changeAmmo(Ammo19_4.GREEN_AMMO)
    tank.shoot()
    tank.changeAmmo(Ammo19_4.RED_AMMO)
    tank.shoot()

}

class Tank19_4(var ammo: Ammo19_4?) {

    fun changeAmmo(newAmmo: Ammo19_4) {
        ammo = newAmmo
        println("Заряжены патроны цвета: ${ammo?.color}")
    }

    fun shoot() {
        println("Нанесено ${ammo?.damage} едениц урона")
    }

}

enum class Ammo19_4(val color: String, val damage: Int) {
    BLUE_AMMO("синий", 5),
    GREEN_AMMO("зеленый", 10),
    RED_AMMO("красный", 20);
}