package lesson_17

fun main() {

    val firstQuestion = QuizElement()
    println(firstQuestion.question)
    println(firstQuestion.answer)

}

class QuizElement {
    var question = "кот"
        get() = "геттервопрос"
    var answer = "котейка"
        get() = "геттерответ"
        set(value) {
            field = value
        }

}