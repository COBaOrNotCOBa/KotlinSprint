package lesson_11

fun main() {

    val userOne: User = User(
        id = 1,
        login = "Tor",
        password = "imTor",
        eMail = "powerTor@tor.com",
    )

    val userTwo: User = User(
        id = 2,
        login = "Locki",
        password = "imLocki",
        eMail = "powerLocki@loki.com",
    )

    println(userOne.id)
    println(userOne.login)
    println(userOne.password)
    println(userOne.eMail)
    println()
    println(userTwo.id)
    println(userTwo.login)
    println(userTwo.password)
    println(userTwo.eMail)

}