package lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>()
    var ingredient: String
    var ingredientsAll = ""
    println("Введите по очереди пять ингредиентов: ")

    for (i in 0..4){
        ingredient = readln()
        listOfIngredients.add(ingredient)
    }

    listOfIngredients.sort()
    for (i in 0..4){
        ingredientsAll += listOfIngredients[i] + " "
    }

    println(ingredientsAll)

}