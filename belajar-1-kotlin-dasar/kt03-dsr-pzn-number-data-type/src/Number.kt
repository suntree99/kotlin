fun main() {
    // integer number
    var age: Byte = 30
    var height: Short = 170
    var distance: Int = 2000
    var balace: Long = 100000000L

    println(age)
    println(height)
    println(distance)
    println(balace)

    // floating point number
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535

    println(value)
    println(radius)

    // literal number
    var decimalLIteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalLIteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // underscore number
    var price = 9_000_000_000L

    println(price)

    // conversion
    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
}