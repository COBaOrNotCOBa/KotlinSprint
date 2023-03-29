package lesson_1

fun main() {

    val seconds : Short = 6480

    var min : Int
    var secondsLeft : Int

    secondsLeft = seconds%60
    min =seconds/60

    if (secondsLeft < 10) {
        println("$min:0$secondsLeft")
    } else {
        println("$min:$secondsLeft")
    }

}