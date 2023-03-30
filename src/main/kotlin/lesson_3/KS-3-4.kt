package lesson_3

fun main() {

    var starPosition = "E2"
    var endPosition = "E4"
    var strokeNumber: Short = 1

    println("[$starPosition-$endPosition;$strokeNumber]")

    starPosition = "D2"
    //тут нужно просто вписать D3 или алгоритм чтобы из D2 сделать D3 c шагом вперёд? )
    endPosition = "D3"
    strokeNumber++

    println("[$starPosition-$endPosition;$strokeNumber]")

}