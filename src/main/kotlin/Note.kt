import java.time.Instant
import java.time.LocalDateTime

data class Note(
    val text: String? = "",
    val createdAt: Instant? = Instant.now(),
    val updatedAt: Instant? = createdAt) {

    override fun toString(): String {
        return "${text} - текст \n " +
                "${createdAt} - дата создания \n " +
                "${updatedAt} - дата обновления  \n "}
}
