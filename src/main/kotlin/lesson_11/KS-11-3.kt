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