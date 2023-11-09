import java.time.Instant
import kotlin.collections.distinct
class NoteServiceImpl {

    var note = Note()
    var noteList = ArrayList<Note>()

    fun addNote(text: String?, id: Long){
        noteList.add(Note(text = text,id = id))
    }
    fun save (note: Note){
            if (note.id != 0.toLong()) {
                updateText(note.text)
                return
            }
        noteList.add(note)
    }

    fun getAll(){
        for (i in noteList.indices) {
            System.out.println(noteList.get(i))
        }
    }

//   fun getAllUniqueTexts(): List<String> {
//
//        val distinct = noteList.distinctBy{it.text}.toList()
//       // println(noteList)
//       println(distinct)
//
//
//       return emptyList()
//    }

    fun getAllUniqueTexts(): List<String> = noteList.asSequence().map{it.text}
        .distinct()
        .toList() as List<String>




fun updateText(text: String?) { // dobavit id
         this.note = note.copy(text = text, updatedAt = Instant.now())
    }

    fun getNote() : String { // dobavit id
        return note.toString()
    }

    //вывести все элементы больше айдишника
    fun getAfter(count: Int, id: Long) : List<Note> = noteList.sortedBy {it.id}
        .dropWhile{ it.id!! <= id}.take(count)


    //вывести все элементы меньше айдишника
    fun getBefore(count: Int, id: Long): List<Note> = noteList.sortedBy{it.id}
        .dropLastWhile{ it.id!! >= id}.take(count)
// .dropWhile { it.id!! < id}.dropLast(Int)
    //.takeWhile {it.index < Int-1 }

}