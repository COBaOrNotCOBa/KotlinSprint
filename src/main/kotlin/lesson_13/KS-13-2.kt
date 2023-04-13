package lesson_13

fun main() {

    val contactOne = PhoneBook2(
        "COBa",
        1991234567,
        null,
    )

    contactOne.showContact()
}

class PhoneBook2(
    val name: String,
    val telephoneNumber: Int,
    val company: String?,
) {

    fun showContact() {
        println(
            "Имя: $name \n" +
                    "Номер: $telephoneNumber \n" +
                    "Компания: ${company ?: "[не указано]"}"
        )
    }

}