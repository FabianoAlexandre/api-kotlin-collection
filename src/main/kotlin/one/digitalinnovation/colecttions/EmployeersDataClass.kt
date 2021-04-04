package one.digitalinnovation.colecttions

data class employee(
    val name: String,
    val salary: Double,
    val contracting: String
){
    override fun toString(): String =
        """
            name: $name
            salary: $salary
            contracting: $contracting
        """.trimIndent()
}