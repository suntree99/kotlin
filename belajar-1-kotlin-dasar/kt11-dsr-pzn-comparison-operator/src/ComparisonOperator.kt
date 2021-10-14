fun main() {
    val a = 100
    val b = 200

    val value1: Boolean = a > b
    val value2: Boolean = a < b
    val value3: Boolean = a >= b
    val value4: Boolean = a <= b
    val value5: Boolean = a != a
    val value6: Boolean = a == a

    println(value1)
    println(value2)
    println(value3)
    println(value4)
    println(value5)
    println(value6)

    println("a" == "a")
    println("a" <= "b")
    println("a" != "b")

}