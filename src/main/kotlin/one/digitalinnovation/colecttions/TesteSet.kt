package one.digitalinnovation.colecttions

val employeersOne = setOf(laura, joao)
val employeersTwo = setOf(Ruan)
val employeersThree = setOf(laura, joao, Ruan)

fun main(){
    Union()
    println("-----------------")
    Subtract()
    println("-----------------")
    Intersect()
}
fun Union(){
    //Unindo os sets employeersOne e employeersTwo
    val resultUnion = employeersOne.union(employeersTwo)
    resultUnion.forEach {
        println(it) }
}
fun Subtract() {
    val resultSubtract = employeersThree.subtract(employeersOne)
    resultSubtract.forEach{
        println(it)
        }
}
fun Intersect(){
    val resultIntersect = employeersThree.intersect(employeersOne)
    resultIntersect.forEach{println(it)}
}
