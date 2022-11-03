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
	Untuk mendefinisikan variabel Char bisa menggunakan tanda kutip tunggal (' ')
	```kotlin
	val character = 'A'
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

Update README.md