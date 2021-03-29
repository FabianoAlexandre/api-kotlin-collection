package one.digitalinnovation.colecttions

val arrayString = arrayOf("Laura", "Fabiano", "Ruan", "Suely")

fun main(){
    showArray()
    println("-----------------------")
    orderArray()
    println("-----------------------")

}
fun showArray(){
    arrayString.forEach {
        println(it)
    }
}

fun orderArray(){
    arrayString.sort()
    for(i in arrayString){
        println(i)
    }
}
