package one.digitalinnovation.colecttions

val values = arrayOf(1, 4, 6, 4, 9)

fun main(args: Array<String>) {
    println("SimpĺeFor")
    simpleFor()
    println("eachFor")
    eachFor()
    println("eachForIt")
    eachForIt()
    println("indicesFor")
    indicesFor()
    println("Ordenar")
    Ordenar()

}

fun simpleFor(){
    for (i in values){
        println(i)

    }
}
fun eachFor(){
    values.forEach { i -> println(i) }// variavel i recebendo o valor de values.

}

fun eachForIt(){
    values.forEach {
        println(it) // O it assume o papel da variavel

    }
}
fun indicesFor(){
    for(i in values.indices){
        println(values[i])
    }
}
fun Ordenar(){
    values.sort()
    values.forEach{println(it)}

}