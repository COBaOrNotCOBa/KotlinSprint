package lesson_19

fun main() {

    println(Status19_3.TAKE_OFF.getStatus())
    println(Status19_3.LANDING.getStatus())
//    println(Status19_3.SHOOTING_ASTEROIDS.getStatus())

}

enum class Status19_3(val id: Int) {
    TAKE_OFF(101){
        override fun getStatus(): String {
            return "Взлетает"
        }
                 },
    LANDING(102){
        override fun getStatus(): String {
           return "need more information for logic"
        }
                },
    SHOOTING_ASTEROIDS(103){
        override fun getStatus(): String {
            TODO("NotImplementedError")
        }
    };

    abstract fun getStatus() : String
}