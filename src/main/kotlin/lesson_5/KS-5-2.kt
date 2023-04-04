package lesson_5

import java.time.LocalDate

fun main() {

    val userYearOfBorn = readLine()!!.toInt()

    val result = if (LocalDate.now().year - userYearOfBorn >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Давай Досвидания"

    println(result)
}

const val AGE_OF_MAJORITY = 18