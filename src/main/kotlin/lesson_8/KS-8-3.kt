package lesson_8

fun main() {

    val ingredients = arrayOf("огурцы", "помидоры", "перец", "соль", "подсолнечное масло")

    println("Введите название искомого ингридиента: ")
    val userIngredient = readln()

    if (ingredients.indexOf(userIngredient) > -1) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}