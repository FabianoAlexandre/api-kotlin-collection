package one.digitalinnovation.colecttions

val `employeer´s` = mutableListOf(laura, Ruan,)

fun main(){
    println("----------------------\n Show Employeers of the MultableListOf")
    showMutable()
    println("----------------------\n Add new Employeers")
    addEmployee()
    println("----------------------\n Remove Employee Ruan")
    removeEmployee()
    println("----------------------\n Select Employeers")
    selectEmployeers()
    println("----------------------\n Set Employeers")
    setEmployeers()
}
fun showMutable(){
    `employeer´s`.forEach{println(it)}
}

fun addEmployee(){
    `employeer´s`.add(joao)
    `employeer´s`.forEach{println(it)}
}

fun selectEmployeers(){
    //Showing employeers's data Laura and Ruan
    val employeers1 = mutableListOf(laura, Ruan)
    employeers1.forEach{println(it)}
}
fun removeEmployee(){
    `employeer´s`.remove(Ruan)
    `employeer´s`.forEach{(println(it))}
}
fun setEmployeers(){
    val employeeSet = mutableSetOf(joao, laura)
    employeeSet.forEach{(println(it))}
    println("------ADD Ruan------")
    employeeSet.add(Ruan)
    employeeSet.forEach{(println(it))}
    println("------Remove Laura------")
    employeeSet.remove(laura)
    employeeSet.forEach{(println(it))}

}