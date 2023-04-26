package lesson_20


fun main() {

    val robot = Robot20_5()
    val modifier: (String) -> String = { phrase ->
        phrase.split(" ").asReversed().joinToString(" ")
    }

    repeat(3) {
        robot.say()
    }

    println()
    robot.setModifier(modifier)

    repeat(3) {
        robot.say()
    }
}

class Robot20_5 {
    private var modifier: (String) -> String = { phrase -> phrase }
    val phrases = listOf(
        "добрый день",
        "Выбрасывай мусор в урну",
        "Мой руки перед едой",
        "Не топчи газоны",
        "УБИТЬ ВСЕХ ЛЮДЕЙ!"
    )

    fun say() = println(modifier(phrases.random()))


    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}