package lesson_13

fun main() {

    val listOfContactOne = mutableListOf(
        PhoneBook3(
            "COBa",
            null,
            null,
        ),
        PhoneBook3(
            "Man",
            1991234567,
            "Superman",
        ),
        PhoneBook3(
            null,
            1991237,
            "nullOrNull",
        )
    )

    for (i in 0..2) listOfContactOne[i].showContact()

}

class PhoneBook3(
    val name: String?,
    val telephoneNumber: Int?,
    val company: String?,
) {

    fun showContact() {
        println(
            "Имя: ${name ?: "[не указано]"} \n" +
                    "Номер: ${telephoneNumber ?: "[не указано]"} \n" +
                    "Компания: ${company ?: "[не указано]"}"
        )
        println()
    }

}