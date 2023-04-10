package lesson_11

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