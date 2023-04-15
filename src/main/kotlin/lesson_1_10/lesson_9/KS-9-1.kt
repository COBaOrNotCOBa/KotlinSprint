package lesson_1_10.lesson_9

fun main() {

    val ingredients = listOf("соль", "зеленый лук", "сметана")

    println("В рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach {
        println(it)
    }

}