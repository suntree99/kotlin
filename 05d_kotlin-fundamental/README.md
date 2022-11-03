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

## Variable & Data Types (Operation)

* Variable
	* Struktur deklarasi variabel
		```kotlin
		var identifier: Type = initialization
		```
		```kotlin
		var name: String = "Budi Darmawan"
		```
		* Tipe data boleh tidak ditulis jika variable langsung diinisialisasi (diberikan nilai) `var name = "Budi Darmawan"`

* Tipe data menentukan operasi
	* Operasi + pada String
		```kotlin
		fun main() {
			val firstName = "Budi "
			val lastName = "Darmawan"
			print(firstWord + lastWord) // Budi Darmawan
		}
		```
	* Operasi + pada Int
		```kotlin
		fun main() {
			val valueA: Int = 10
			val valueB = 20
			print(valueA + valueB) // 30
		}
		```

## Char
Char digunakan untuk menyimpan karakter tunggal, bisa dibuat menggunakan tanda kutip tunggal (' ')
```kotlin
val character = 'A'
```

* Operasi pada Char
	```kotlin
	fun main() {
		var vocal = 'A'

		println("Vocal " + vocal++) // Vocal A
		println("Vocal " + vocal++) // Vocal B
		println("Vocal " + vocal++) // Vocal C
		println("Vocal " + vocal--) // Vocal D
		println("Vocal " + vocal--) // Vocal C
		println("Vocal " + vocal--) // Vocal B
		println("Vocal " + vocal--) // Vocal A
	}
	```
	_Hal ini karena setiap Char merupakan representasi dari Unicode. Ketika Unicode A (0041) ketika diincrement akan menjadi 0042 yang merupakan Unicode dari B._

## String
String digunakan untuk menyimpan kupulan karakter, bisa dibuat menggunakan tanda kutip ganda (" ")
```kotlin
val name = "Budi"
```
* Operasi pada String
	```kotlin
	fun main() {
		val text  = "Kotlin"
		val firstChar = text[0]

		print("First character of $text is $firstChar") // First character of Kotlin is K
	}
	```
	_Hal ini karena String adalah sekumpulan Char berbentuk Array, sehingga kita bisa mendapatkan karakter tunggal dengan manfaatkan indexing_
* Loop pada String
	```kotlin
	fun main() {
		val text  = "Kotlin"
		for (char in text){
			print("$char ") // K o t l i n 
		}
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
	fun main() {
		val line = """
			Line 1
			Line 2
			Line 3
			Line 4
		""".trimIndent()
	
		print(line)
	}

	/*
			Line 1
			Line 2
			Line 3
			Line 4
	*/
	```
	_Raw String memungkinkan kita menuliskan multiline dan arbitrary text tanpa escaped character._

## Function
* Struktur deklarasi function
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
	* Jika fungsi hanya berisi satu expression untuk menentukan nilai kembalian maka dapat ditulis dengan struktur expression function
		```kotlin
		fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
		```
	* Jika fungsi tidak mengembalikan nilai maka digunakan `Unit` sebagai tipe kembaliannya
		```kotlin
		fun printUser(name: String): Unit {
			print("Your name is $name")
		}
		```
		Atau dapat dihilangkan
		```kotlin
		fun printUser(name: String): Unit {
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

## 

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

Update README.md