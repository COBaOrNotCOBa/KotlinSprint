package lesson_4

fun main() {

    val minimumNumberCrew = 55
    val maximumNumberCrew = 70
    val minimumBoxOfProvision = 50

    print("Есть ли повреждения корпуса. Записывать Boolean переменную: ")
    val damegeHull = readln().toBoolean()
    print("Текущая численность экипажа: ")
    val numberCrew = readln().toInt()
    print("Текущее количество ящиков провизии: ")
    val boxOfProvisions = readln().toInt()
    print("Благоприятные ли метеоусловия. Записывать Boolean переменную: ")
    val weatherConditions = readln().toBoolean()

    val seeOdyssey =
        ((!damegeHull) && (numberCrew > minimumNumberCrew) && (numberCrew < maximumNumberCrew) && (boxOfProvisions > minimumBoxOfProvision)) or
                ((numberCrew == maximumNumberCrew) && (boxOfProvisions > minimumBoxOfProvision) && (weatherConditions))

    println("Будет ли одисея: $seeOdyssey")

}