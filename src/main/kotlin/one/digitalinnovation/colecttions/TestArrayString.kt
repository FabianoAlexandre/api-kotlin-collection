package one.digitalinnovation.colecttions

val arrayString = arrayOf("Laura", "Fabiano", "Ruan", "Suely")

fun main(){
    println("-----------------------\n Showing names")
    showArray()
    println("-----------------------\n Sort the names")
    orderArray()


}
fun showArray(){
    //Showing the names
    arrayString.forEach {
        println(it)
    }
}

fun orderArray(){
    //Sort the names
    arrayString.sort()
    for(i in arrayString){
        println(i)
    }
}
