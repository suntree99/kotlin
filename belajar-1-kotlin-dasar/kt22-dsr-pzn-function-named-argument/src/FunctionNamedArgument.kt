fun sayHello(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}
fun main() {
    sayHello("Eko", "Kurniawan", "Khannedy")
    sayHello(
        lastName = "Khannedy",
        firstName = "Eko",
        middleName = "Kurniawan"
    )
}