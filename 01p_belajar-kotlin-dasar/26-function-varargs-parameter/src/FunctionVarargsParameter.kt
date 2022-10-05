fun hitungTotalArray(array: Array<Int>): Int{
    var total = 0
    for (value in array) {
        total += value
    }
    return total
}

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    val arrayInput: Array<Int> = arrayOf(10, 10, 10, 10, 10)
    val result1 = hitungTotalArray(arrayInput)
    println(result1)

    val result2 = hitungTotal("Eko", 10, 10, 10, 10, 10)
    println(result2)
}