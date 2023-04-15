package lesson_1_10.lesson_9

fun main() {

    println("Введите пять ингредиентов через запятую: ")
    val ingredients = readln()
    val listOfIngredients = ingredients.split(",").toMutableList()
    listOfIngredients.sort()
    println(listOfIngredients)

}