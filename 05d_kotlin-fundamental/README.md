# Kotlin Fundamental

## Comment

* Single Line Comment
	```kotlin
	// single line comment
	```

* Multi Line Comment
	```kotlin
	/*
		multi line comment
		Hello Kotlin
	*/
	```

## Variable & Operation

* Variable
	* Struktur deklarasi variabel
		```kotlin
		var identifier: Type = initialization
		```
		```kotlin
		var name: String = "Budi Darmawan"
		```
		* Tipe data boleh tidak ditulis jika variable langsung diinisialisasi (diberikan nilai) `var name = "Budi Darmawan"`

* Operasi pada Tipe Data
	* Operasi + pada String
		```kotlin
		val firstName = "Budi "
		val lastName = "Darmawan"
		print(firstWord + lastWord) // Budi Darmawan
		```
	* Operasi + pada Integer
		```kotlin
		val valueA: Int = 10
		val valueB = 20
		print(valueA + valueB) // 30
		```

## Char
Char digunakan untuk menyimpan karakter tunggal, bisa dibuat menggunakan tanda kutip tunggal (' ')
```kotlin
val character = 'A'
```

* Operasi pada Char
	```kotlin
	var vocal = 'A'

	println("Vocal " + vocal++) // Vocal A
	println("Vocal " + vocal++) // Vocal B
	println("Vocal " + vocal++) // Vocal C
	println("Vocal " + vocal--) // Vocal D
	println("Vocal " + vocal--) // Vocal C
	println("Vocal " + vocal--) // Vocal B
	println("Vocal " + vocal--) // Vocal A
	```
	_Hal ini karena setiap Char merupakan representasi dari Unicode. Ketika Unicode A (0041) diincrement akan menjadi 0042 yang merupakan Unicode dari B._

## String
String digunakan untuk menyimpan kumpulan karakter, bisa dibuat menggunakan tanda kutip ganda (" ")
```kotlin
val name = "Budi"
```

* Operasi pada String
	```kotlin
	val text  = "Kotlin"
	val firstChar = text[0]

	print("First character of $text is $firstChar") // First character of Kotlin is K
	```
	_Hal ini karena String adalah sekumpulan Char berbentuk Array, sehingga kita bisa mendapatkan karakter tunggal dengan manfaatkan 
	
* Loop pada String
	```kotlin
	val text  = "Kotlin"
	for (char in text){
		print("$char ") // K o t l i n 
	}
	```

* Escaped String
	```kotlin
	val statement = "Kotlin is \"Awesome!\""
	```
	_Selain \” di atas, terdapat beberapa escaped character lain di dalam sebuah String, antara lain:_
	* _\t: menambah tab ke dalam teks._
	* _\n: membuat baris baru di dalam teks._
	* _\’: menambah karakter single quote kedalam teks._
	* _\”: menambah karakter double quote kedalam teks._
	* _\\\\: menambah karakter backslash kedalam teks._
	* _\u00A9: akan menampilkan unicode ©_

* Raw String
	```kotlin
	val line = """
		Line 1
		Line 2
		Line 3
		Line 4
	""".trimIndent()

	print(line)

	/*
		Line 1
		Line 2
		Line 3
		Line 4
	*/
	```
	_Raw String memungkinkan kita menuliskan multiline dan arbitrary text tanpa escaped character._

## Function
* Struktur deklarasi Function
	```kotlin
	fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
		return result
	}
	```
	```kotlin
	fun setUser(name: String, age: Int): String {
		return "Your name is $name, and you $age years old"
	}
	```

	* Expression Function (Jika fungsi hanya berisi satu expression untuk menentukan nilai kembalian) 
		```kotlin
		fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
		```
	
	* Void Function (Jika fungsi tidak mengembalikan nilai maka digunakan `Unit` sebagai tipe kembaliannya)
		```kotlin
		fun printUser(name: String): Unit {
			print("Your name is $name")
		}
		```
		* Penulisan Unit dapat dihilangkan
		```kotlin
		fun printUser(name: String) {
			print("Your name is $name")
		}
		```

* Pemanggilan function
	```kotlin
	fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
	
	fun printUser(name: String) {
		println("Your name is $name")
	}

	fun main() {
		val user = setUser("Budi", 30)
		println(user) // Your name is Budi, and you 30 years old
	
		printUser("Budi") // Your name is Budi
	}
	```

## If Expression 
* If
	```kotlin
	val openHours = 7
	val now = 20

	if (now > openHours){
		println("Office already open") // Office already open
	}
	```

* If Else
	```kotlin
	val openHours = 7
	val now = 20
	val office: String

	if (now > openHours) {
		office = "Office already open"
	} else {
		office = "Office is closed"
	}
	
	print(office) // Office already open
	```

* Menyimpan nilai If Expression langsung pada variable
	```kotlin
	val openHours = 7
	val now = 20
	val office: String

	office = if (now > openHours) {
		"Office already open"
	} else {
		"Office is closed"
	}
	
	print(office) // Office already open
	```

* If .. Else If .. Else
	```kotlin
	val openHours = 7
	val now = 7
	val office: 
	
	office = if (now > 7) {
		"Office already open"
	} else if (now == openHours){
		"Wait a minute, office will be open"
	} else {
		"Office is closed"
	}
	
	print(office) // Wait a minute, office will be open
	```
	&#x1F534; _Kotlin tidak mendukung ternary operator (condition ? then : else), karena peran dari operator tersebut sudah digantikan dengan if expressions._

## Boolean
* Conjunction atau AND (&&)
	```kotlin
	val officeOpen = 7
	val officeClosed = 16
	val now = 20

	val isOpen = if (now >= officeOpen && now <= officeClosed){
		true
	} else {
		false
	}

	print("Office is open : $isOpen") // Office is open : false
	```
	* Dapat disederhanakan menjadi
	```kotlin
	val officeOpen = 7
	val officeClosed = 16
	val now = 20

	val isOpen = now >= officeOpen && now <= officeClosed

	print("Office is open : $isOpen") // Office is open : false
	```

* Disjunction atau OR (||)
	```kotlin
	val officeOpen = 7
	val officeClosed = 16
	val now = 20

	val isClose = now < officeOpen || now > officeClosed

	print("Office is closed : $isClose") //Office is closed : true
	```

* Negation atau NOT (!)
	```kotlin
	val officeOpen = 7
	val now = 10
	val isOpen = now > officeOpen

	if (!isOpen) {
		print("Office is closed")
	} else {
		print("Office is open")
	}

	/*
		Output : Office is open
	*/
	```

## Numbers
* Int (32 Bit)
	```kotlin
	val intNumber = 100
	```
	_Range -2^31 sampai +2^31-1_

* Long (64 Bit)
	```kotlin
	val longNumber: Long = 100
	```
	```kotlin
	val longNumber = 100L
	```
	_Range -2^63 sampai +2^63-1_

* Short (16 Bit)
	```kotlin
	val shortNumber: Short = 10
	```
	```kotlin
	val longNumber = 100L
	```
	_Range -2^63 sampai +2^63-1_

* Byte (8 Bit)
	```kotlin
	val byteNumber = 0b11010010
	```
	_Range -128 sampai +127_

* Double (64 Bit)
	```kotlin
	val doubleNumber: Double = 1.3
	```
	_Dapat menyimpan 15-16 angka dibelakang koma_

* Float (32 Bit)
	```kotlin
	val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567
	```
	_Dapat menyimpan 6-7 angka dibelakang koma_

* Nilai minimum, maximum dan Overflow
	```kotlin
	val minInt = Int.MIN_VALUE
	val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // Nilai overflow akan loop ke nilai minimum

	println(minInt) // -2147483648
	println(maxInt) // 2147483647
    println($overRangeInt) // -2147483648
	```

* Operator Aritmatika
	```kotlin
    val numberOne = 1
    val numberTwo = 2
 
    println(numberOne + numberTwo) // 3
    println(numberOne - numberTwo) // -1
    println(numberOne * numberTwo) // 2
    println(numberOne / numberTwo) // 0 (pembagian dikotlin dibulatkan kebawah)
	```
	* _Jika pembagian ingin spesifik gunakan tipe data double_
	* _Operasi aritmatika mengikuti prinsip KuKaBaTaKu (Kurung Kali Bagi Tambah Kurang)_

* Konversi Number
	```kotlin
	val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

	print(intNumber) // 10

	val stringNumber = "23"
    val intNumber3 = 3
 
    print(intNumber3 + stringNumber.toInt()) // 26
	```
	* _Dalam konversi perlu memperhatikan range overflow, berikut beberapa fungsi konversi number:_
	* _toByte(): Byte_
	* _toShort(): Short_
	* _toInt(): Int_
	* _toLong(): Long_
	* _toFloat(): Float_
	* _toDouble(): Double_
	* _toChar(): Char_

* Readable Underscore
	```kotlin
	val readableNumber = 1_000_000 // mudah dibaca dengan tanda underscore 
    print(readableNumber) // 1000000
	```

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