fun main() {
    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val nilai: Array<Int> = arrayOf(7, 8, 9)
    nilai[1] = 6
    nilai.set(2, 10)

    val anggota: Array<String?> = arrayOfNulls(5)
    anggota[0] = "Jono"
    anggota[1] = null
    anggota[2] = "Jana"
    anggota[3] = "Jini"
    anggota[4] = null

    println(members)
    println(members[1])
    println(members.get(2))
    println(nilai)
    println(nilai[1])
    println(nilai.get(2))
    println(anggota[3])
    println(anggota[4])
    println(anggota.size)
}