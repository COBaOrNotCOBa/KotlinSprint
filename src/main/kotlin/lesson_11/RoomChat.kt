package lesson_11

class RoomChat(
    val cover: String,
    val roomName: String,
    val listOfParticipants: List<String>,
) {
    val statusList = listOf("разговаривает","микрофон выключен","пользователь заглушен")

    fun longPushAvatar() {
        println("${listOfParticipants[(0 until listOfParticipants.size).random()]}")
    }

    fun userStatus(){
        println("${statusList[(0 until statusList.size).random()]}")
    }

}