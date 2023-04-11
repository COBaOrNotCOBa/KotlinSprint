package lesson_11

fun main() {

    val roomChatOne = RoomChat(
        "Black",
        "Black panterns",
        listOfParticipants = listOf("Cat", "big Cat", "small cat"),
    )

    val roomChatTwo = RoomChat(
        "White",
        "White wolfs",
        listOfParticipants = listOf("Dog", "big dog", "small dog"),
    )

    val roomChatThree = RoomChat(
        "Yellow",
        "Sunshine",
        listOfParticipants = listOf("Me"),
    )

    roomChatOne.displeyRoom()
    roomChatTwo.displeyRoom()
    roomChatThree.displeyRoom()

    roomChatTwo.longPushAvatar()
}

class RoomChat(
    val cover: String,
    val roomName: String,
    val listOfParticipants: List<String>,
) {
    val statusList = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

    fun longPushAvatar() {
        println()
        println(listOfParticipants[0])
    }

    fun displeyRoom() {
        println()
        println("Обложка комнаты: $cover")
        println("Название комнаты: $roomName")
        for (i in 0 until listOfParticipants.size) {
            println("Аватар пользователя ${i + 1} в состояние: ${statusList.random()}")
        }
    }
}