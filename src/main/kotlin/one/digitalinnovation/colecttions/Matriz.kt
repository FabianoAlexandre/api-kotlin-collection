package one.digitalinnovation.colecttions

val matrix = arrayOf(
    arrayOf(1, 2, 5, 6),
    arrayOf(5, 6, 8, 7),
    arrayOf(8, 9, 4, 2),
    arrayOf(1, 5, 6, 7)
)
fun main() {
    showMatrix()
    println("\n----------Sum of the pairs values--------")
    sumPairsValues()
    println("\n----------Sum of the odd values--------")

    sumOddValues()
}
fun showMatrix(){
    for (i in matrix) {
        for(value in i) {
            print("\t $value")
            //matrix.forEach { println(it) }
        }
        println()
    }
}
fun sumPairsValues() {
    var sumPairs: Int = 0
    for (i in matrix) {
        for (j in i) {
            if (j % 2 == 0) {
                sumPairs += j
            }
            print("\t $j")
            //matrix.forEach { println(it) }
        }
        println()
    }
    println("Total of the pairs values : $sumPairs")
}
fun sumOddValues(){
    var sumOdd: Int = 0
    for (i in matrix) {
        for (j in i) {
            if (j % 2 == 1) {
                sumOdd += j
            }
            print("\t $j")
            //matrix.forEach { println(it) }
        }
        println()
    }
    println("Total of the odd values : $sumOdd")
}


