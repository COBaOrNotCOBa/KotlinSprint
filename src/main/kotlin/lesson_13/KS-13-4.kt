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
            val name = readLine()
            println("Введите номер телефона: ")
            val telephoneNumber = readLine()
            println("Введите название компании: ")
            val company = readLine()
            if (telephoneNumber != null && (name != null || company != null)) {
                val contact = PhoneBook4(name, telephoneNumber, company)
                listOfContact4.add(contact)
            } else println("Контакт небыл добавлен")
            println("Если хотите добавить новую запись, введите \"да\"")
        } while (readLine() == "да")

        showContact(listOfContact4)
    }
}