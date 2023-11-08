import java.time.Instant
class NoteService {

    var note = Note()

    fun updateText(text: String) {
         this.note = note.copy(text = text, updatedAt = Instant.now())
    }

    fun getNote() : String {
        return note.toString()
    }

}