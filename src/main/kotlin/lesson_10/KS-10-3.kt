package lesson_10

fun main() {

    println("Введите длину создаваемого пароля")
    val password = readln().toInt()

    println(passwordGenerator(password))

}

fun passwordGenerator (lenghtPassword: Int) : String{
    val symbolRangeOne: CharRange = '\"'..'?'
    val symbolDog = '@'
    val symbolRangeTwo: CharRange = '['..'_'
    val symbolApostrophe = '\''
    val symbolWave = '`'
    val symbolAll = symbolRangeOne + symbolRangeTwo + symbolWave + symbolApostrophe + symbolDog
    var password = ""
    for (i in 1.. lenghtPassword){
        password+= symbolAll.random()
    }
    return password
}