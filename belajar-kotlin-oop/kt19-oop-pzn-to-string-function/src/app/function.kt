package app

import data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"
    eko.middleName = "Kurniawan"
    eko.lasttName = "Khannedy"

    eko.sayHello("Budi")
    eko.run();

    val fullName = eko.getFullName()
    println(fullName)
}