package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(5, 12, 13, 10, 12)

    values.forEach { print("$it ") }

    println()
    values.sort()
    values.forEach { print("$it ") }
}
