package one.digitalinnovation.colecttions

fun main() {
    val values = IntArray(5)

    values[0] = 6
    values[1] = 3
    values[2] = 7
    values[3] = 2
    values[4] = 9
    println("---------------------------\nDefault")
    for(valor in values){// monstrando os valores de forma padrão
        println(valor)
    }
    println("---------------------------\nforEach")
    values.forEach {
            valor -> println(valor)//monstrando os valor com o Método Lambda
    }
    println("---------------------------\nIndices")
    for(index in values.indices){
        println(values[index])
    }
    println("---------------------------\nMetodo Sort")
    values.sort()
    for(valor in values){
        println(valor)
    }
}