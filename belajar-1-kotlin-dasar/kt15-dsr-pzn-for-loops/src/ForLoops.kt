fun main() {
    val array = arrayOf("Eko", "Kurniawan", "Khannedy", "Joko", "Budi", "Rudi")
    for (name in array) {
        println(name)
    }

    val range = 100 downTo 0 step 5
    var total = 0
    for (i in range) {
        println(i)
        total++
    }
    println("Total Perulangan = $total")

    val ukuranArray = 0..array.size-1
    for (i in ukuranArray) {
        println("Data index ke-$i : ${array.get(i)}")
    }
}