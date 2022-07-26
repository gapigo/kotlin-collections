package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    println("resultUnion: ")
    resultUnion.forEach { println("- $it") }

    println("------------------")
    println("resultSubtract: ")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println("- $it") }

    println("------------------")
    println("insersect: ")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println("- $it") }
}