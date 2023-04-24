package lesson_20


fun main() {

    val robot = Robot20_5()
    repeat(3) {
        robot.say()
    }
    println()
    robot.setModifier { phrase -> phrase.split(" ").asReversed().joinToString(" ") }
    repeat(3) {
        robot.say()
    }
}

class Robot20_5 {
    private var modifier: ((String) -> String)? = null

    fun say() {
        val phrases = listOf(
            "добрый день",
            "Выбрасывай мусор в урну",
            "Мой руки перед едой",
            "Не топчи газоны",
            "УБИТЬ ВСЕХ ЛЮДЕЙ!"
        )
        val phrase = phrases.random()
        val modifiedPhrase = if (modifier != null) modifier!!(phrase)
        else phrase
        println(modifiedPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}