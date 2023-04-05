package lesson_4

fun main() {

    val daysOfTraining: Short = 5
    val evenDay = daysOfTraining % 2 ==0

    val exerciseHand = !evenDay
    val exerciseLeg = evenDay
    val exerciseBack = evenDay
    val exercisePress = !evenDay

    println(
        """
        Упражнения для рук:    $exerciseHand
        Упражнения для ног:    $exerciseLeg
        Упражнения для спины:  $exerciseBack
        Упражнения для пресса: $exercisePress
    """.trimIndent()
    )

}