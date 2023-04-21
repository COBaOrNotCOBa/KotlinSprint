package lesson_19

fun main() {

    val goodsOne = GoodsDescription("штаны", 101, Goods19_2.CLOTHES)
    val goodsTwo = GoodsDescription("ручка", 102, Goods19_2.OFFICE_SUPPLIES)
    val goodsThree = GoodsDescription("жвачка", 103, Goods19_2.OTHER)

    goodsOne.getInformationOfGoods()
    goodsTwo.getInformationOfGoods()
    goodsThree.getInformationOfGoods()

}

class GoodsDescription(val goodsTitle: String, val id: Int, val category: Goods19_2) {

    fun getInformationOfGoods() {
        when (id) {
            category.id -> {
                print("Товар: $goodsTitle, id: ${category.id}, категория: ")
                println(setTitleGoods(category))
            }
        }
    }
}

enum class Goods19_2(val id: Int) {
    CLOTHES(101),
    OFFICE_SUPPLIES(102),
    OTHER(103),
    ERROR(0),
}

fun setTitleGoods(goods: Goods19_2): String {
    return when (goods) {
        Goods19_2.CLOTHES -> "Одежда"
        Goods19_2.OFFICE_SUPPLIES -> "Офисные принадлежности"
        Goods19_2.OTHER -> "Разное"
        Goods19_2.ERROR -> "Не опознано"
    }
}