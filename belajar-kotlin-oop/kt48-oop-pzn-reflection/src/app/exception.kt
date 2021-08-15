package app

import exception.ValidationException

fun validationAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validationAndSayHello("Eko")
        validationAndSayHello("")
        println("Program")
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }

}