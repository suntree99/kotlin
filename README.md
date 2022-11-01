# Kotlin

## Instalasi

* Instalasi OpenJDK
	* Windows
		* Download dan Instal [.msi](https://www.azul.com/downloads/?version=java-8-lts&os=windows&architecture=x86-64-bit&package=jdk) dengan spesifikasi *Java 8 (LST), Windows, x86 64-bit, JDK*
		* Konfigurasi JAVA_HOME pada system variable dengan value direktori instalasi Zulu/zulu-8
		* Cek instalasi pada Command Prompt dengan perintah `java -version`

	* Linux dan macOS
		* Instalasi SDKMAN
			* Instal Curl
				```cmd
				sudo apt install curl
				```
				Cek version
				```cmd
				curl -version
				```
				Untuk macOS bisa menggunakan homebrew
				```cmd
				brew install curl
				```
			* Instal SDKMAN
				```cmd
				curl -s "https://get.sdkman.io" | bash
				```
				```cmd
				source "$HOME/.sdkman/bin/sdkman-init.sh"
				```
				Cek version
				```cmd
				sdk version
				```
					_SDKMAN 5.11.0+644_
		* Instal OpenJDK
			```cmd
			sdk install java 8.0.332-zulu
			```
			Cek version
			```cmd
			sdk list java
			```
			Untuk mengganti version gunakan perintah
			```cmd
			sdk default java <another-version>
			```
				_Contoh version : `11.0.8-open`_
			Cek version terkini
			```cmd
			sdk current java
			```
				_Using java version 11.0.8-open_



## Kotlin is nicer Java

Perbedaan sintaks Java dan Kotlin
* Java
	```java
	public class SomeClasses{
		public static void main(String[] args){
			System.out.println("Hello");
		}
	}
	```
* Kotlin
	```kotlin
	class SomeClasses{
		fun main(){
			println("Hello")
		}
	}
	```
	* _Kotlin tidak memerlukan semicolon atau titik koma (;)_

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