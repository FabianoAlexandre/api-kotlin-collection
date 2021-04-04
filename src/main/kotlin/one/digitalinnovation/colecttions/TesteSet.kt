package one.digitalinnovation.colecttions

val employeersOne = setOf(laura, joao)
val employeersTwo = setOf(Ruan)
val employeersThree = setOf(laura, joao, Ruan)

fun main(){
    union()
    println("-----------------")
    subtract()
    println("-----------------")
    intersect()
}
fun union(){
    //unindo os sets employeers One e employeersTwo
    val resultUnion = employeersOne.union(employeersTwo)
    resultUnion.forEach {
        println(it) }
}
fun subtract() {
    val resultSubtract = employeersThree.subtract(employeersOne)
    resultSubtract.forEach{
        println(it)
        }
}
fun intersect(){
    val resultIntersect = employeersThree.intersect(employeersOne)
    resultIntersect.forEach{println(it)}
}
