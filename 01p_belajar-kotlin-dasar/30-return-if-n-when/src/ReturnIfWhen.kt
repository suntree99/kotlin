fun main() {

    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Eko"))

    fun sayingHello(name: String = ""): String {
        return when (name) {
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Kurniawan"))
}