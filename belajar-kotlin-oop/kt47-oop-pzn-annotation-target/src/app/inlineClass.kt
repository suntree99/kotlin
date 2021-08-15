package app

import data.Token

fun main() {
    val token = Token("Ini Token")
    println(token.value)
    println(token.toUpper())
}