package lesson_9

fun main() {

    val numberOfIngredients = listOf(2, 50, 15)

    println("Сколько порций нужно? ")
    val numbersOfServings = readln().toInt()

    val numbersOfIngredientsFull = numberOfIngredients.map {
        it * numbersOfServings
    }

    println("На $numbersOfServings порций вам понадобится: " +
            "Яиц – ${numbersOfIngredientsFull[0]}, " +
            "молока – ${numbersOfIngredientsFull[1]}, " +
            "сливочного масла – ${numbersOfIngredientsFull[2]}")

}