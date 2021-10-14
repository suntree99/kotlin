fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val namaLengkap: (String, String) -> String = { firstName, lastName -> "$firstName $lastName"}
    println(namaLengkap("Eko", "Kurniawan"))

    val sayHello: (String) -> String = { "Hello $it" }
    println(sayHello("Eko"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Eko Kurniawan"))
}