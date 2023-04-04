package lesson_4

fun main() {

    print("Есть ли повреждения корпуса. Записывать Boolean переменную: ")
    val damegeHull = readLine().toBoolean()
    print("Текущая численность экипажа: ")
    val numberOfCrew = readLine()!!.toInt()
    print("Текущее количество ящиков провизии: ")
    val boxOfProvisions = readLine()!!.toInt()
    print("Благоприятные ли метеоусловия. Записывать Boolean переменную: ")
    val weatherConditions = readLine().toBoolean()

    val seeOdyssey =
        ((!damegeHull) && (numberOfCrew in 56..69) && (boxOfProvisions > 50)) or
                ((numberOfCrew == 70) && (boxOfProvisions > 50) && (weatherConditions))

    println("будет ли одисея: $seeOdyssey")

}