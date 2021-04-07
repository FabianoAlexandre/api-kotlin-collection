package one.digitalinnovation.colecttions

fun main(){

    val repositorio = Repositorio<employee>()
    //Repositorio<employee>() // ^ Melhoria realizada pela linguagem kotlin

    repositorio.create(joao.name, joao)
    repositorio.create(laura.name, laura)
    repositorio.create(Ruan.name, Ruan)

    println(repositorio.findById(laura.name))
     println("----------------------------------------")
    repositorio.findAll().forEach{ println(it)}
    println("----------------------------------------")
    repositorio.remove(laura.name)
    repositorio.findAll().forEach{println(it)}
}

