package lesson_11

fun main() {
//создал 3 комнаты
    val roomChatOne = RoomChat(
        "Black",
        "Black panterns",
        listOfParticipants = listOf(
            Participant("Cat", "cat"),
            Participant("Black Cat", "black cat")
        ),
    )

    val roomChatTwo = RoomChat(
        "White",
        "White wolfs",
        listOfParticipants = listOf(
            Participant("Dog", "dog"),
            Participant("White Dog", "white dog")
        ),
    )

    val roomChatThree = RoomChat(
        "Yellow",
        "Sunshine",
        listOfParticipants = listOf(
            Participant("Sun", "yellow Sun")
        ),
    )
//вывел в консоль 3 комнаты, и на долго зажал первый аватар
    roomChatOne.displeyRoom()
    roomChatTwo.displeyRoom()
    roomChatThree.displeyRoom()

    roomChatTwo.longPushAvatar(0)
}
//класс комната
class RoomChat(
    val cover: String,
    val roomName: String,
    val listOfParticipants: List<Participant>,
) {
//список состояний участников
    val statusList = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

//функция вывода данныех а комнате, участниках и их состоянии
    fun displeyRoom() {
        println()
        println("Обложка комнаты: $cover")
        println("Название комнаты: $roomName")
        for (i in 0 until listOfParticipants.size) {
            println("${listOfParticipants[i].avatar} пользователь ${i + 1} в состояние: ${statusList.random()}")
        }

    }
//функция долгово нажатия на аватар для вывода имени
    fun longPushAvatar(index: Int) {
        println(listOfParticipants[index].name)
    }

}
//класс участника с аватаром и именем
class Participant(
    val name: String,
    val avatar: String,
)



