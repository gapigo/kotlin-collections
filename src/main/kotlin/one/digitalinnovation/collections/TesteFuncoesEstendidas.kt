package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("-------------------- Somatoria")
    println(salarios.somatoria())

    println("-------------------- Media")
    println(salarios.media())

}