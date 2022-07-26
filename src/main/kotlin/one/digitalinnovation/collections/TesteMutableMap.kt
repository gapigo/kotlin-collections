package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("Testing findById")
    println(repositorio.findById(joao.nome))
    println(repositorio.findById("joao.nome"))

    println("-----------")
    println("Testing findAll")
    println(repositorio.findAll().forEach { println(it) })

    println("-----------")
    println("Testing remove")
    repositorio.remove(maria.nome)
    println(repositorio.findAll().forEach { println(it) })

}