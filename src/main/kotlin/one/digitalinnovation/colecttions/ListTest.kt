package one.digitalinnovation.colecttions

val laura = employee("Laura",3300.89, "CLT")
val joao = employee("João",10000.0, "PJ")
val Ruan = employee("Ruan",3009.80, "CLT")

val employees = listOf(laura, joao,  Ruan)

fun main(){
    showEmployees()
    getEmployee()
    //salaryLawest()
    orderListBySalary()
    orderListByName()
    orderListByGroup()


}
fun showEmployees(){
    println("Show Employees\n----------------")
    employees.forEach{ println(it)}

}
fun getEmployee(){
    println("------------\nGet employee Ruan\n${employees.find { it.name == "Ruan"}}")

}
fun salaryLawest(){
    println("----------\nLawest salary\n${salary.maxOrNull()}")
}

fun orderListBySalary(){
    println("---------------\n")
    employees
        .sortedBy {it.salary}
        .forEach {println(it)}
}
fun orderListByName(){
    println("---------------\n")
    employees
        .sortedBy {it.name}
        .forEach {println(it)}
}
fun orderListByGroup(){
    println("---------------\n")
    employees
        .groupBy { it.contracting }
        .forEach {println(it)}
}

