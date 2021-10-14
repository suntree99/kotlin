fun sayHello(name: String) {
    println("Hello $name")
}

fun sayingHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Eko")
    sayHello("Budi")
    sayHello("Joko")

    sayingHello("Eko", "Kurniawan")
    sayingHello("Budi", null)
    sayingHello("Joko", "Nugraha")
}