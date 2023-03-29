package lesson_2

import java.time.LocalTime

fun main() {

    val departureTime = LocalTime.parse("09:39")
    val minutes : Int = departureTime.hour * 60 + departureTime.minute
    val travelTime : Int = 457
    val arrivalTimeHour : Int
    val arrivalTimeMinute : Int
    val arrivalTimeHourString : String
    val arrivalTimeMinuteString : String

    arrivalTimeHour = (minutes+travelTime)/60
    arrivalTimeMinute = (minutes+travelTime)%60

    if (arrivalTimeHour<10){
        arrivalTimeHourString = "0${arrivalTimeHour.toString()}"
    } else{
        arrivalTimeHourString = arrivalTimeHour.toString()
    }

    if (arrivalTimeMinute<10){
        arrivalTimeMinuteString="0${arrivalTimeMinute.toString()}"
    } else{
        arrivalTimeMinuteString=arrivalTimeMinute.toString()
    }

    println("Вермя прибытия $arrivalTimeHourString:$arrivalTimeMinuteString")

}