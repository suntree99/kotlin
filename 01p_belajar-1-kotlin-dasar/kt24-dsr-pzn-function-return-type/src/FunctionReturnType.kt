fun jumlah(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val hasil = a / b
        return hasil
    }
}

fun main() {
    println(jumlah(10, 10))

    val value = jumlah(100, 100)
    println(value)

    println(bagi(20, 2))
    println(bagi(200, 0))
}