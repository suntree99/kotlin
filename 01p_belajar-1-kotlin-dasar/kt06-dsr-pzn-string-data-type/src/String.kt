fun main() {
    var firstname: String = "Eko"
    var lastname: String = "Khannedy"
    var address: String = """
        Jalan Belum Jadi RT 01 RW 01
        Kabupaten Subang
        Jawa Barat
        Indonesia
    """.trimIndent()

    println(firstname)
    println(lastname)
    println(address)

    var fullname1: String = firstname + " " + lastname
    var fullname2: String = "$firstname $lastname"
    var desccription: String = "Total $fullname1 Character is ${fullname1.length}"

    println(fullname1)
    println(fullname2)
    println(desccription)

}