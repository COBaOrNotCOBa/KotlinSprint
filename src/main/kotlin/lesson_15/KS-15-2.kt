package lesson_15

fun main() {

    val temperature = TemperatureStationOptions()
    val rainfall = Rainfall()

    temperature.connectToServer()
    temperature.sendDataToServer()

    rainfall.connectToServer()
    rainfall.sendDataToServer()

}

abstract class WeatherStationOptions() {

    fun connectToServer() = println("Соединение с сервером установленно")

    abstract fun sendDataToServer()

}

class TemperatureStationOptions() : WeatherStationOptions() {

    override fun sendDataToServer() = println("Текущая температура")
}

class Rainfall() : WeatherStationOptions() {

    override fun sendDataToServer() = println("Текущее количество осадков")
}

