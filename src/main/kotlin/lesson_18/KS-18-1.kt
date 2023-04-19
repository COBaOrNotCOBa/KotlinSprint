package lesson_18

fun main() {

    val orderOne = Order18_1()
    val orderTwo = Order18_1()

    orderOne.listOfOrder(
        1,
        "Пупс",
    )
    orderTwo.listOfOrder(
        2,
        listOf("Ноги", "Руки", "Голова"),
    )
}
class Order18_1 {
    fun listOfOrder(
        orderNumber: Int,
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun listOfOrder(
        orderNumber: Int,
        product: List<String>,
    ) {
        print("Заказаны следующие товары: ")
        product.forEachIndexed { index, value ->
            if (index == product.size - 1) print(value)
            else print("$value, ")
        }
    }
}