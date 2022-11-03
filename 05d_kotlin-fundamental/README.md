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

## Data Types (Operation) & Variable

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

* Operator menarik pada Char
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
val name = 'Budi'
```
```kotlin
fun main() {
	val text  = "Kotlin"
	val firstChar = text[0]

	print("First character of $text is $firstChar") // First character of Kotlin is K
}
```
_Hal ini karena String adalah sekumpulan Char berbentuk Array, sehingga kita bisa mendapatkan karakter tunggal dengan manfaatkan indexing_

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