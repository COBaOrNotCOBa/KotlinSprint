package lesson_8

fun main() {

    val ingredients = arrayOf("огурцы", "помидоры", "перец", "соль", "подсолнечное масло")
    for (i in 0 until ingredients.size) println(ingredients[i])

    println("Введите какой ингридиент хотите поменять: ")
    val userIngredient = readln()
    val numberIngredientInMassive = ingredients.indexOf(userIngredient)

    if (numberIngredientInMassive < 0) println("Ингредиента $userIngredient нет в списке")
    else {
        println("Какой новый ингридент вы хотите добавиь? ")
        ingredients[numberIngredientInMassive] = readln()
        println("Готово! Вы сохранили следующий список: ")
        for (i in 0 until ingredients.size) println(ingredients[i])
    }

}