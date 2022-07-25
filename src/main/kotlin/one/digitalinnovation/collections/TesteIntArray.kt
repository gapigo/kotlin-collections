package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 4
    values[1] = 5
    values[2] = 3
    values[3] = 1
    values[4] = 8

    print("\nManeira de iteração 1: ")
    for (valor in values)
        print("$valor ")

    print("\nManeira de iteração 2: ")
    values.forEach{
        print("$it ")
    }

    print("\nManeira de iteração 3: ")
    for (index in values.indices) {
        print("${values[index]} ")
    }

    print("\nArrumando o array...: ")
    values.sort()
    values.forEach { print("$it ") }
}