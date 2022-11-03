# Control Flow

* Enumeration
* Expression & Statement
* When Expression
* While and Do While
* Range and For Loop
* Break and Continue Labels

## Enumeration
* Struktur Enum (Name)
    ```kotlin
    fun main() {
        val color : Color = Color.RED
        print(color) // RED
    }
    
    enum class Color{
        RED, GREEN, BLUE
    }
    ```

* Struktur Enum (Value)
    ```kotlin
    fun main() {
        val colorRed = Color.RED
        val colorGreen = Color.GREEN
        val colorBlue = Color.BLUE
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    ```

* Struktur Enum (Deklarasi Anonymous Class pada setiap Objek Enum)
    ```kotlin
    enum class Color(val value: Int) {
        RED(0xFF0000){
            override fun printValue() {
                println("value of RED is $value")
            }
        },
        GREEN(0x00FF00){
            override fun printValue() {
                println("value of GREEN is $value")
            }
        },
        BLUE(0x0000FF){
            override fun printValue() {
                println("value of BLUE is $value")
            }
        };
    
        abstract fun printValue()
    }
    ```

* Cara menampilkan *nama* Enum dengan Syntethic Method *values()*
    ```kotlin
    fun main() {
        val colors: Array<Color> = Color.values()
        colors.forEach { color ->
            print("$color ") // RED GREEN BLUE
        }
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    ```

* Cara menampilkan *nilai* Enum dengan Syntethic Method *valueOf()* atau *color.value*
    ```kotlin
    fun main() {
        val color: Color = Color.valueOf("RED")
        println("Color is $color") // Color is RED
        println("Color value is ${color.value.toString(16)}") //Color value is ff0000
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    ```

* Cara menampilkan *nama dan nilai* Enum dengan Syntethic Method *enumValues() dan enumValueOf()*
    ```kotlin
    fun main() {
        val colors: Array<Color> = enumValues()
        colors.forEach {color ->
            println(color) // 
        }
    
        val color: Color = enumValueOf("RED")
        println("Color is $color")
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }

    /*
       RED
       GREEN
       BLUE
       Color is RED
    */
    ```


* Properti *ordinal* pada Enum
    ```kotlin
    fun main() {
        val color: Color = Color.GREEN
    
        print("Position GREEN is ${color.ordinal}") // Position GREEN is 1
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    ```

* *When Expression* pada Enum
    ```kotlin
    fun main() {
        val color: Color = Color.GREEN
    
        when(color){
            Color.RED -> print("Color is Red")
            Color.BLUE -> print("Color is Blue")
            Color.GREEN -> print("Color is Green") // Color is Green
        }
    }
    
    enum class Color(val value: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    ```
    
## Expression & Statement
* If sebagai Statement (tidak mengembalikan nilai)
    ```kotlin
    val now = 8
    if (now > openOffice) 
        print("Office already open")
    else 
        print("Office close")
    ```

* If sebagai Expression (mengembalikan nilai dan disimpan kedalam variable)
    ```kotlin
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office) // Office already open
    ```

* Inisialisasi variable merupakan contoh statement
    ```kotlin
    fun main() {
        val value1 = 10 // Statement
        val value2 = 10 // Statement
    
        sum(value1, value2)
    }
    
    fun sum(value1: Int, value2: Int) = value1 + value2
    ```

* Expression di dalam Expression (1*4)
    ```kotlin
    fun main() {
        sum(1 , 1 * 4) // Expression dalam expression
    }
    
    fun sum(value1: Int, value2: Int) = value1 + value2
    ```

## When Expression
* Struktur When Expression
    ```kotlin
    val value = 7
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    ```

* Menyimpan When Expression kedalam variable
    ```kotlin
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
 
    println(stringOfValue)
    ```

* When Expression dengan 2 atau lebih baris kode menggunakan kurung kurawal {}
    ```kotlin
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
 
    println(stringOfValue)
    ```

* When untuk memeriksa instance dengan *is* dan *!is*
    ```kotlin
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
    ```

* When untuk memeriksa nilai di dalam *range*
    ```kotlin
    val value =  27
    val ranges = 10..50
 
    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
    ```

* When untuk menangkap subjek di dalam sebuah variabel
    ```kotlin
    fun main() {
        val registerNumber = when(val regis = getRegisterNumber()){
            in 1..50 -> 50 * regis
            in 51..100 -> 100 * regis
            else -> regis
        }
    }
    
    fun getRegisterNumber() = Random.nextInt(100)
    ```

* If Ekspression digunakan jika kondisi percabangan tidak lebih dari 2 dan tidak terlalu rumit
    ```kotlin
    val anyType : Any = 100L
    if (anyType is Long){
        println("the value has a Long type")
    } else {
        println("the value is not Long type")
    }
    ```

* When Expression digunakan untuk kondisi percabangan lebih dari 2
    ```kotlin
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
    ```

## While and Do While
## Range and For Loop
## Break and Continue Labels

##
##

# Heading 1 / Judul Utama (gunakan #)

## Heading 2 / Sub Judul (gunakan ##)

Text biasa (ditulis biasa tanpa format apapun)

[Hyperlink](https://www.google.com) (nama hyperlink dibungkus kurung siku, urlnya dibungkus tanda kurung biasa)

```bash
git add .
git commit -m "baris code menggunakan backtick 3x di awal(sertakan bahasanya) dan akhir code"
git push
```

Untuk `menyoroti` bungkus text dengan backtick 1x

# Template

## Sub Judul 
```<bahasa>
git add .
git commit -m 'Update README.md'
git push

```

```kotlin

```

Update README.md