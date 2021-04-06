package one.digitalinnovation.colecttions
val pair: Pair<String, Double> = Pair(
    "Joao", 1000.0,
    )

fun main(){
    showMap1()
    showMap2()
}
fun showMap1(){
    val map1 = mapOf(pair)
    map1.forEach{(k, v) -> println("chave : $k - valor: $v")}

}
fun showMap2(){
    val map2 = mapOf(
        "Pedro" to 2500.0, //Função in fix
        "Fabiano" to 5578.0
        )
    map2.forEach{ (k ,v) -> println("Chave : $k - Valor: $v")}
}