package lesson_19

fun main() {

    val listOfMans = mutableListOf<Man19_5>()
    val counterOfMans = 4
    var manName: String
    var manSex: String


    for (i in 0..counterOfMans) {
        println("Введите имя человека №${i + 1}: ")
        manName = readln()
        println("Введите пол человека №${i + 1}, буквой \"м\" или \"ж\": ")
        manSex = readln()
        when (manSex) {
            Sex19_5.MALE.sex -> listOfMans.add(Man19_5(manName, Sex19_5.MALE))
            Sex19_5.FEMALE.sex -> listOfMans.add(Man19_5(manName, Sex19_5.FEMALE))
            manSex -> listOfMans.add(Man19_5(manName, Sex19_5.ERROR))
        }
    }

    for (i in 0..counterOfMans) {
        println("Имя ${listOfMans[i].name}, пол ${listOfMans[i].sex.sex} ")
    }
}

class Man19_5(val name: String, val sex: Sex19_5)


enum class Sex19_5(val sex: String) {
    MALE("м"),
    FEMALE("ж"),
    ERROR("unknown"),
}