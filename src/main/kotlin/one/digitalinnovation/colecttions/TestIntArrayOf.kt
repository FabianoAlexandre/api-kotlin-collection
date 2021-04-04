package one.digitalinnovation.colecttions

fun main(){
    val values = intArrayOf(1,3,4,1,19,8)

    println("-----------------------------\nShow values")
    values.forEach { println(it) }
    println("-----------------------------\nOrder values")
    values.sort()
    values.forEach { println(it) }

}