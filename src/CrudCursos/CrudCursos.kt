package CrudCursos

import Curso
import java.util.concurrent.atomic.AtomicInteger

class CrudCursos (
    id: Int,
    name: String,
    description: String
) : Curso(
    id, name, description
) {
    companion object {
        private val id = AtomicInteger()
        fun newEntry(name: String, description: String) = Curso(id.getAndDecrement(), name, description)
        fun message(message:String):Unit{
            println("${message}")
        }
    }
}