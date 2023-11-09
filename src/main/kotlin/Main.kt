import java.lang.IllegalArgumentException
import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    var temp: String



    val service = NoteServiceImpl()
    service.addNote("2111",1)
    service.addNote("111",2)
    service.addNote("111",3)
    service.addNote("111",4)
    //проверка save
    println("Введите id")
    temp = `in`.nextLine()
     try {

       service.save(Note("aaaaaaaaaaa", null,null, temp.toLong()))
     }catch (e: IllegalArgumentException){}
    service.getAll()
    println(service.getAllUniqueTexts())
    // println(service.getNote())
    println("getAfter")
    println( service.getAfter(5, 1))
    println("getBefore")
    println( service.getBefore(5, 1))
}
//ошибка время + исключения