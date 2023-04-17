package lesson_15

fun main() {

    val temperature = TemperatureStationOptions()
    val rainfall = Rainfall()

    temperature.connectToServer()
    temperature.sendDataToServer()

    rainfall.connectToServer()
    rainfall.sendDataToServer()

}

abstract class WeatherStationOptions {
    abstract val data: String

    fun connectToServer() = println("Соединение с сервером установленно")

    abstract fun sendDataToServer()

}

class TemperatureStationOptions() : WeatherStationOptions() {
    override val data: String = "Текущая температура"
    override fun sendDataToServer() = println(data)
}

class Rainfall() : WeatherStationOptions() {
    override val data: String = "Текущее количество осадков"

    override fun sendDataToServer() = println(data)
}

