package lesson_11

fun main() {
    val forum = Forum()

    val userOne = forum.newUser("Batman", "Bat@man.com", "123")
    val userTwo = forum.newUser("Superman", "Super@man.com", "456")

    forum.newMessage(userOne.id, "Хьюстон у нас п...")
    forum.newMessage(userTwo.id, "Вас не слышно! Повторите!")
    forum.newMessage(userOne.id, "Хьюстон у нас п!!!")
    forum.newMessage(userTwo.id, "Непонятно")

    forum.printThread()
}

class User(
    val id: Int,
    val login: String,
    val email: String,
    var password: String
)

class Forum {
    private val users = mutableListOf<User>()
    private val messages = mutableListOf<String>()

    fun newUser(username: String, email: String, password: String): User {
        val id = users.size
        val user = User(id, username, email, password)
        users.add(user)

        return user
    }

    fun newMessage(authorId: Int, message: String) {
        val author = users.find { it.id == authorId }
        messages.add("${author?.login}: $message")
    }

    fun printThread() {
        messages.forEach {
            println(it)
        }
    }
}

