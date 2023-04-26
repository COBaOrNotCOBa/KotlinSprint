package lesson_20

fun main() {

    val player = Player20_3()

    val playerHaveKeyOfDoor: (Boolean) -> Unit = {
        if (it) println("Игрок открыл дверь")
        else println("У вас нет нужного ключа")
    }

    playerHaveKeyOfDoor(player.haveKeyOfDoor)
    player.haveKeyOfDoor = true
    playerHaveKeyOfDoor(player.haveKeyOfDoor)

}

class Player20_3(var haveKeyOfDoor: Boolean = false)