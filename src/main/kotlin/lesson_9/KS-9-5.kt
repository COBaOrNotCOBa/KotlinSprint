package lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>()
    var ingredient: String
    var ingredientsAll = ""
    val countIngredients = 4
    var newCountIngredients = 4
    println("Введите по очереди пять ингредиентов: ")

    for (i in 0..countIngredients) {
        ingredient = readln()
        if (!listOfIngredients.contains(ingredient)) listOfIngredients.add(ingredient)
        else newCountIngredients--
    }

    listOfIngredients.sort()

    for (i in 0..newCountIngredients) {
        ingredientsAll += listOfIngredients[i] + ", "
    }
    ingredientsAll = (ingredientsAll.trim().replaceFirstChar(Char::titlecase) + ".").replace(",.", ".")

    println(ingredientsAll)

}