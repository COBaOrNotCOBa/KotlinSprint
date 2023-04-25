package lesson_20

fun main() {

    val listOfString = listOf("0", "1", "2", "3", "Four", "5", "6", "7", "8")
    val lambdaList = listOfString.mapIndexed { index, element -> { println("Нажат элемент $element") } }

    for (i in listOfString.indices) {
        if (i % 2 == 0) lambdaList[i]()
    }
}