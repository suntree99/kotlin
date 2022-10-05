fun main() {
    tailrec fun display(value: Int) {
        println("Display $value")
        if (value > 0) {
            display(value - 1)
        }
    }

//    display(10000)

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, value * total )
        }
    }

    println(factorialRecursive(10))
}