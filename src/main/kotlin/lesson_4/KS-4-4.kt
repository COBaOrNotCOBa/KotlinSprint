package lesson_4

fun main() {

    val daysOfTraining: Short = 5
    val exerciseHand = daysOfTraining % 2 != 0
    val exerciseLeg = daysOfTraining % 2 == 0
    val exerciseBack = daysOfTraining % 2 == 0
    val exercisePress = daysOfTraining % 2 != 0
    println(
        """
        Упражнения для рук:    $exerciseHand
        Упражнения для ног:    $exerciseLeg
        Упражнения для спины:  $exerciseBack
        Упражнения для пресса: $exercisePress
    """.trimIndent()
    )


}