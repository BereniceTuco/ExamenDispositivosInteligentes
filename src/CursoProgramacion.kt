import java.util.concurrent.atomic.AtomicInteger

class CursoProgramacion (
    id: Int,
    name: String,
    description: String
) : Curso(id, name, description)
{
    companion object {
        private val id = AtomicInteger()
        fun newEntry(name: String, description: String) = Curso(id.getAndDecrement(), name, description)
        fun message(message:String):Unit{
            println("${message}")
        }
    }
}
val listaCursoProgramacion = mutableListOf<CursoProgramacion>()