package lesson_17

fun main() {

    val folder = Folder17_3(
        "Folder name",
        9,
    )

    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.isSecret}")
    folder.isSecret = true
    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.isSecret}")
    folder.isSecret = false
    println("Имя: ${folder.name}, количество файлов: ${folder.fileCounter}, секретный флаг: ${folder.isSecret}")
}

class Folder17_3(
    name: String,
    fileCounter:Int,
    var isSecret: Boolean = false,
) {
    var name: String =name
        get() {
            if (isSecret) return "Скрытая папка"
            else return field
        }
    var fileCounter: Int = fileCounter
        get() {
            if (isSecret) return 0
            else return field
        }
}