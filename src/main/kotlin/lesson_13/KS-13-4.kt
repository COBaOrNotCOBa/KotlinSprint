package lesson_13

fun main() {
    PhoneBookFunction().addContact()
}

class PhoneBook4(
    var name: String?,
    var telephoneNumber: String?,
    var company: String?,
)

class PhoneBookFunction {

    fun showContact(contacts: List<PhoneBook4?>) {
        contacts.forEach {
            println(
                "Имя: ${it?.name ?: "[не указано]"} \n" +
                        "Номер: ${it?.telephoneNumber ?: "[не указано]"} \n" +
                        "Компания: ${it?.company ?: "[не указано]"}"
            )
            println()
        }
    }

    fun addContact() {
        val listOfContact4 = mutableListOf<PhoneBook4>()

        do {
            println("Введите имя: ")
            val name = readlnOrNull()?.takeIf { it.isNotEmpty() } ?: "Не указано"
            println("Введите номер телефона: ")
            val telephoneNumber = readlnOrNull()?.takeIf { it.isNotEmpty() } ?: "Не указано"
            println("Введите название компании: ")
            val company = readlnOrNull()?.takeIf { it.isNotEmpty() } ?: "Не указано"
            if (telephoneNumber != "Не указано" && (name != "Не указано" || company != "Не указано")) {
                val contact = PhoneBook4(name, telephoneNumber, company)
                listOfContact4.add(contact)
            } else println("Контакт небыл добавлен \n")
            println("Если хотите добавить новую запись, введите \"да\"")
        } while (readLine() == "да")

        showContact(listOfContact4)
    }
}