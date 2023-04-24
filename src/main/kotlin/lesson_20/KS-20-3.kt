package lesson_20

fun main() {

    val player = Player20_3()

    val checkPlayerKey: (Boolean) -> Unit = fun(haveKey: Boolean): Unit =
        if (haveKey) println("Игрок открыл дверь")
        else println("У вас нет нужного ключа")

    checkPlayerKey(player.haveKeyOfDoor)
    player.haveKeyOfDoor = true
    checkPlayerKey(player.haveKeyOfDoor)

}

class Player20_3(var haveKeyOfDoor: Boolean = false)

