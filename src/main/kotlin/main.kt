
val enterTimeInSecond: Int = 86400
fun main() {
    println(agoToText(enterTimeInSecond))

}
fun agoToText (time: Int): String{
    var text: String
    when (time){
        in 0 .. 60 -> text = " был(а) в сети только что"
        in 61 .. 60 * 60 -> text = " был(а) в сети  ${agoMinutes(enterTimeInSecond)}"
        in 60 * 60 + 1 .. 24 * 60 * 60 -> text = " был(а) в сети ${agoHour(enterTimeInSecond)}"
        in 24 * 60 * 60 + 1 .. 48 * 60 * 60 -> text = " был(а) в сети сегодня"
        in 48 * 60 * 60 + 1 .. 72 * 60 * 60 -> text = " был(а) в сети вчера"
       else -> text = " был(а) в сети давно"
    }
    return text
}
fun agoMinutes (time: Int): String {
    var minutes: Int = (enterTimeInSecond / 60)
    var textMinutes: String = "$minutes минут назад"
    if (minutes % 10 == 1 && minutes !== 11) {
        textMinutes = "$minutes минуту назад"
    } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 ==4){
        textMinutes = "$minutes минуты назад"
    }
    return textMinutes
}
fun agoHour (time: Int): String {
    var hours: Int = (enterTimeInSecond / 3600)
    var textHours: String = "$hours часов назад"
    if (hours % 10 == 1 && hours !== 11) {
        textHours = "$hours час назад"
    } else if (hours == 2 || hours == 3 || hours == 4 || hours == 22 || hours == 23 || hours == 24) {
        textHours = "$hours часа назад"
    }
    return textHours
}
