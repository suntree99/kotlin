fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val toUpper = { value: String -> value.toUpperCase() }
    val result1 = hello("Eko", toUpper)
    val result2 = hello("Eko", { value: String -> value.toLowerCase() })
    val result3 = hello("Eko") { value: String -> value.toLowerCase() } // trailing lambda (lambda di akhir)

    println(result1)
    println(result2)
}