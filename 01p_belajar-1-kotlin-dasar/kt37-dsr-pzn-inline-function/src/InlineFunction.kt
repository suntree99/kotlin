inline fun hello(
    fisrtName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${fisrtName()} ${lastName()}"
}

fun main() {
    for (i in 0..100) {
        println(hello({"Eko"}, {"Kurniawan"}))
    }
}