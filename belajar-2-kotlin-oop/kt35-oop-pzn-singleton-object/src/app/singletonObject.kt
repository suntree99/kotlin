package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Diubah"
    println(Utilities.toUpper("Eko"))
    a()
    b()

    println(Application.Utilities.toUpper("Eko"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}