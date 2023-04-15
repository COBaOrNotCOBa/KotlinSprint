package lesson_1_10.lesson_4

fun main() {

    print("Есть ли повреждения корпуса. Записывать Boolean переменную: ")
    val damegeHull = readln().toBoolean()
    print("Текущая численность экипажа: ")
    val numberCrew = readln().toInt()
    print("Текущее количество ящиков провизии: ")
    val boxOfProvisions = readln().toInt()
    print("Благоприятные ли метеоусловия. Записывать Boolean переменную: ")
    val weatherConditions = readln().toBoolean()

    val minimumNumberCrew = 55
    val maximumNumberCrew = 70
    val minimumBoxOfProvision = 50
    val resultNotDamage = ((!damegeHull) &&
            (numberCrew > minimumNumberCrew) &&
            (numberCrew < maximumNumberCrew) &&
            (boxOfProvisions > minimumBoxOfProvision))
    val resultGoodWeather = ((numberCrew == maximumNumberCrew) &&
            (boxOfProvisions > minimumBoxOfProvision) &&
            (weatherConditions))

    val seeOdyssey = resultNotDamage || resultGoodWeather

    println("Будет ли одисея: $seeOdyssey")

}