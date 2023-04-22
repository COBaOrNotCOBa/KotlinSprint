package lesson_19

fun main() {

    printMan(addMan())

}

class Man19_5(val name: String, val sex: Sex19_5)

fun addMan(): List<Man19_5> {
    var manName: String
    var manSex: String
    val listOfMans = mutableListOf<Man19_5>()
    var choice: String
    do {
        println("Введите имя человека: ")
        manName = readln()
        println("Введите пол человека, буквой \"М\" или \"Ж\": ")
        manSex = readln()
        listOfMans.add(
            when (manSex) {
                Sex19_5.MALE.sex -> Man19_5(manName, Sex19_5.MALE)
                Sex19_5.FEMALE.sex -> Man19_5(manName, Sex19_5.FEMALE)
                else -> Man19_5(manName, Sex19_5.ERROR)
            }
        )
        println("Ввести ещё одного человека?")
        choice = readln()
    } while (choice == "да")
    return listOfMans
}

fun printMan(listOfMans: List<Man19_5>) {
    for (i in 0 until listOfMans.size) {
        println("Имя ${listOfMans[i].name}, пол ${listOfMans[i].sex.sexFull} ")
    }
}

enum class Sex19_5(val sex: String, val sexFull: String) {
    MALE("М", "Мужской"),
    FEMALE("Ж", "Женский"),
    ERROR("unknown", "не опознано"),
}