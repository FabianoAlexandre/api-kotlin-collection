package one.digitalinnovation.colecttions

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
       // map.put(id, value)
          map[id] = value // map.put melhoria realizada pela linguagem kotlin
    }
    fun findById(id: String) = map[id]

    fun findAll() = map.values

    fun remove(id: String) = map.remove(id)
}