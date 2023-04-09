package lesson_8

fun main() {

    val ingredients = arrayOf("огурцы", "помидоры", "перец", "соль", "подсолнечное масло")
    var result = false

    println("Введите название искомого ингридиента: ")
    val userIngredient = readln()

    for (i in 0 until ingredients.size) {
        if (userIngredient == ingredients[i]) {
            result = true
            break
        }
    }

    if (result) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}