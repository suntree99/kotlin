fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 60

    val lulusUjian = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 70
    val lulusEkstra = nilaiEkstra > 65

    val apakahLulus = lulusUjian && lulusAbsen || lulusEkstra
    println(apakahLulus)
}