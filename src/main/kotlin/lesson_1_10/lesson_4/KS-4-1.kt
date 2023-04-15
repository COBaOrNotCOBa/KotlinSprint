package lesson_1_10.lesson_4

fun main() {

    val tableReserveToday = 13
    val tableReserveTomorrow = 9
    println(
        "[Доступность столиков на сегодня: ${TABLES != tableReserveToday}]\n" +
                "[Доступность столиков на завтра: ${TABLES != tableReserveTomorrow}]"
    )

}

const val TABLES = 13