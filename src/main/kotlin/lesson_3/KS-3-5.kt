package lesson_3

fun main() {

    val turn = "D2-D4;0"
    //мне кажется здесь каким-то другим способом нужно было решать )
    val turnReplace = turn.replace(";","-")
    val parts = turnReplace.split("-")

    for(part in parts) println(part)

}