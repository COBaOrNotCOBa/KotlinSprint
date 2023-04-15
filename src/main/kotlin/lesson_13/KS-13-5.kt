package lesson_13

fun main() {

    try {
        val number: Long
        println("Введите номер телефона: ")
        val strNumber = readln()
        number = strNumber.toLong()
        println("Номер телефона: $number")
    } catch (e: NumberFormatException){
        println("Номер телефона может содержать только цифры.")
    }
}