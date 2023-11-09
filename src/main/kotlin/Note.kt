import java.time.Instant

data class Note(
    val text: String? = "",
    val createdAt: Instant? = Instant.now(),
    val updatedAt: Instant? = createdAt,
    val id : Long? = 0)
{



    override fun toString(): String {
        return  " ${text} - текст \n " +
                "${createdAt} - дата создания \n " +
                "${updatedAt} - дата обновления  \n "+
                "${id} - ID  \n "}
}
