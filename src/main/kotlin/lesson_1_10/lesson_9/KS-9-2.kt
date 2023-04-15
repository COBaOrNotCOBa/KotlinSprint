package lesson_1_10.lesson_9

fun main() {

    val recept = mutableListOf("соль", "зеленый лук", "сметана")

    println("В рецепте есть базовые ингредиенты: ")
    recept.forEach {
        println(it)
    }

    println("Желаете добавить еще? ")
    val userAnswer = readln()
    if (userAnswer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        recept.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $recept")
    }

}