package lesson_16

fun main() {

    val order = OrderInInternetShop(22)
    order.requestToManager(22)

}

class OrderInInternetShop(
    private val orderNumber: Int,
    var orderStatus: Boolean = false,
) {
    private fun changeOrderStatus(incomeOrderNumber: Int) {
        orderStatus = true
        println("Статус заказа № $incomeOrderNumber: $orderStatus")
    }

    fun requestToManager(incomeOrderNumber: Int) {
        println("Заявка на заказ № $incomeOrderNumber отправленна менеджеру")
        changeOrderStatus(incomeOrderNumber)
    }
}
