package one.digitalinnovation.colecttions

fun main(){
    val salary = arrayOf(
        "2000".toBigDecimal(),
        "3000".toBigDecimal(),
        "1000".toBigDecimal()
    )

    println(salary.somatoria())
    println("------------------------------")
    println(salary.media())
    println("------------------------------")
    println(salary.sort())


}
