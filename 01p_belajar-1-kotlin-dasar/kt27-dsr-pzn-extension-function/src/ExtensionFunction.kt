fun String.hello() = "Hello $this"

fun String.printHello() = println("Hello $this")

fun main() {
    val name = "Eko"
    println(name.hello())
    name.printHello()
    "Kurniawan".printHello()
}