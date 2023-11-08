import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    var temp: String

    println("Введите текст")
    temp = `in`.nextLine()
    val service = NoteService()
    service.updateText(temp)
    println(service.getNote())

}