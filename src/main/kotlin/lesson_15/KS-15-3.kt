package lesson_15

fun main() {

    val user = StandartUser("UUUser")
    val admin = Admin("Odmin")

    user.readForum()
    user.writeMessage()

    admin.readForum()
    admin.deleteMessage()
    admin.writeMessage()
    admin.deleteUser()

}

interface StandartAccess {
    fun readForum()
    fun writeMessage()
}

interface AdminAccess {
    fun deleteMessage()
    fun deleteUser()
}

abstract class ResidentOfForum(val name: String) : StandartAccess {
    override fun readForum() = println("$name: Читает форум")
    override fun writeMessage() = println("$name: Написал сообщение")
}

class StandartUser(name: String) : ResidentOfForum(name)

class Admin(name: String) : ResidentOfForum(name), AdminAccess {
    override fun readForum() = println("Админ $name: Читает форум")
    override fun writeMessage() = println("Админ $name: Написал сообщение")
    override fun deleteMessage() = println("Админ $name: Удаляет сообщение")
    override fun deleteUser() = println("Админ $name: Удаляет пользователя")
}