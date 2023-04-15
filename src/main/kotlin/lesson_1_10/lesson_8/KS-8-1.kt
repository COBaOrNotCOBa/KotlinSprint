package lesson_1_10.lesson_8

fun main() {

    val views = arrayOf(23, 34, 45, 56, 67, 78, 1)
    var summViewsPerWeek = 0

    for (i in 0 until views.size) summViewsPerWeek += views[i]

    println(summViewsPerWeek)
}