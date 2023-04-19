package lesson_17

fun main() {

    val myPackage = Package17_4(2)

    println(
        "Номер посылки ${myPackage.packageNumber}," +
                " Количество перемещений ${myPackage.packageCounterTranspoted}," +
                " Место нахождениря ${myPackage.packageLocation}"
    )
    myPackage.packageLocation = "B"
    println(
        "Номер посылки ${myPackage.packageNumber}," +
                " Количество перемещений ${myPackage.packageCounterTranspoted}," +
                " Место нахождениря ${myPackage.packageLocation}"
    )
    myPackage.packageLocation = "C"
    println(
        "Номер посылки ${myPackage.packageNumber}," +
                " Количество перемещений ${myPackage.packageCounterTranspoted}," +
                " Место нахождениря ${myPackage.packageLocation}"
    )
}

class Package17_4(val packageNumber: Int) {
    var packageCounterTranspoted = 0
    var packageLocation: String = "A"
        set(value) {
            if (field != value) packageCounterTranspoted++
            field = value
        }

}