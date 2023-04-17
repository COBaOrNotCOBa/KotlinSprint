package lesson_17

fun main() {

    val folder = Folder17_3(
        "F",
        3,
    )
    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.flagSecret}")
    folder.flagSecret = true
    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.flagSecret}")
    folder.flagSecret = false
    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.flagSecret}")
}

class Folder17_3(
    val nameFile: String,
    val counterFile: Int,
) {
    val name: String
        get() {
            if (flagSecret) return "Скрытая папка"
            else return nameFile
        }
    val fileCounter: Int
        get() {
            if (flagSecret) return 0
            else return counterFile
        }
    var flagSecret: Boolean = false

}