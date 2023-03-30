package lesson_2

fun main() {

    val extractCrystal: Int = 7
    val extractMetal: Int = 11
    val extractBuff: Int = 20

    val extractCrystalBonus: Int
    val extractMetalBonus: Int

    extractCrystalBonus = extractCrystal * extractBuff / 100
    extractMetalBonus = extractMetal * extractBuff / 100

    println("Было добыто $extractCrystalBonus кристаллической руды под баффом")
    println("Было добыто $extractMetalBonus железной руды по баффом ")

}