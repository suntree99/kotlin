package app

import data.Address

fun main() {
    val adress1 = Address("Jalan A", "Jakarta")
    val adress2 = Address("Jalan A", "Jakarta", "Indonesia")

    println(adress1.street)
    println(adress2.street)
}