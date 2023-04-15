package lesson_15

fun main() {

    val temperature = TemperatureStationOptions()
    val rainfall = Rainfall()

    temperature.connectToServer()
    temperature.sendDataToServer()
    temperature.temperatureData()

    rainfall.connectToServer()
    rainfall.sendDataToServer()
    rainfall.rainfallData()

}

abstract class WeatherStationOptions() {

    fun connectToServer() = println("Соединение с сервером установленно")

    fun sendDataToServer() = println("Данные отправленны на сервер")
}

class TemperatureStationOptions() : WeatherStationOptions() {

    fun temperatureData() = println("Текущая температура")
}

class Rainfall() : WeatherStationOptions() {

    fun rainfallData() = println("Текущее количество осадков")
}

