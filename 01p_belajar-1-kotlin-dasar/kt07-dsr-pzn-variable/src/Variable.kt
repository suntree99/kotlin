const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val firstname: String = "Eko"
    var lastname = "Khannedy"
    lastname  = "Kurniawan"
    val age = 30
    var cobaNull: String? = null

    println(firstname)
    println(lastname)
    println(age)
    println(cobaNull)
    println(cobaNull?.length)
    println("$APPLICATION : $VERSION")
}