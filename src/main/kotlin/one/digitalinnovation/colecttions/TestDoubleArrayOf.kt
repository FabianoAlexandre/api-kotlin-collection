package one.digitalinnovation.colecttions

var salary = doubleArrayOf(1000.0, 2500.0, 1672.90)

fun main(){
    showDoubleArray()
    maxSalary()
    lowestSalary()
    showSalariesLargerThousand()
    filterBetweenSalaries()
    findSalary()
    verifyingValue()
    getSalary()
    medianSalary()
    shortFormMedianSalary()
    salaryPlusTenPercent()
}

fun showDoubleArray(){
    println("All Salaries")
    salary.forEach { println(it) }
}
fun maxSalary(){
    println("------------\nLarger Salary\n${salary.maxOrNull()}")

}
fun lowestSalary(){
    println("------------\nLowest Salary\n${salary.minOrNull()}")

}
fun showSalariesLargerThousand(){
    val filterSalary = salary.filter { it > 1000 }
    println("-------------\n Salaries Larger than 1.000")
    filterSalary.forEach{ println(it) }
}
fun filterBetweenSalaries(){
    println("--------------\n Salaries between 1000 and 1700\n ${salary.count { it in 1000.0 .. 1700.0 }}"
    )
}
fun findSalary(){
    println("--------------\n Find Salary Equals the 1000.0\n ${salary.find { it == 1000.0 }}")
}
fun verifyingValue(){
    println("--------------\n Find Salary Equals the 1000.0\n ${salary.any { it == 1000.80 }}")

}
fun getSalary() {
    println("--------------\nGet Salary position [2]\n${salary.get(2)}")
}
fun shortFormMedianSalary(){
   println("-----------\nMedian of the Salaries\n${salary.average()}")
}
fun medianSalary(){
    var total = 0.0
     var median: Double

    for (i in salary){
        total += i
    }
    median = total/3
    println("Total of the Salaries\n${total}\nMedian of the Salaries\n${median}" )
}
fun salaryPlusTenPercent(){
    println("--------------------------\nAdding Ten percent on the Salaries")
    salary.forEachIndexed{ index, sal ->
        salary[index] = sal * 1.1
    }
    salary.forEach { println(it) }
}