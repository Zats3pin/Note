import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    var temp: String

    println("Введите текст")
    temp = `in`.nextLine()
    val service = NoteServiceImpl()
service.addNote("2111",0)
    service.addNote("111",1)
    service.addNote("111",2)
    service.addNote("111",3)

    service.save(service.noteList[0])
    service.getAll()
   // service.updateText(temp)
    println(service.getAllUniqueTexts())
    // println(service.getNote())
    println("getAfter")
    println( service.getAfter(5, 1))
    println("getBefore")
    println( service.getBefore(5, 1))
}
//ошибка время + исключения