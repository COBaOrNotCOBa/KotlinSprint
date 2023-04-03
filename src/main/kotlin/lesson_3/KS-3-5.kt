package lesson_3

fun main() {

    val turn = "D2-D4;0"
    val parts = turn.split("-",";")
    for(part in parts) println(part)

}