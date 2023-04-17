package lesson_15

fun main() {
    val balalaika = Instrument(
        "Балалайка",
        1,
    )

    balalaika.searchAccessories()
}

interface SearchAccessories {
    fun searchAccessories() = println("Выполняется поиск")
}

abstract class Product(
    val name: String,
    val counter: Int,
)

class Instrument(
    name: String,
    counter: Int,
) : Product(name, counter), SearchAccessories

class Accessories(
    name: String,
    counter: Int,
) : Product(name, counter)
