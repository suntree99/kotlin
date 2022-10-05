fun sayHello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}
fun main() {
    sayHello("Eko", "Kurniawan")
    sayHello("Budi")
    sayHello("Joko", "Nugraha")
}