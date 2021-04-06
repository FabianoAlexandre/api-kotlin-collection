package one.digitalinnovation.colecttions

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

