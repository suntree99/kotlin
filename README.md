# Kotlin

## Instalasi

* Instalasi OpenJDK
	* Windows
		* Download dan Instal [.msi](https://www.azul.com/downloads/?version=java-8-lts&os=windows&architecture=x86-64-bit&package=jdk) dengan spesifikasi
			* Java Version : Java 8 (LST)
			* Operating System : Windows
			* Architecture : x86 64-bit
			* Java Package : JDK
		* Konfigurasi JAVA_HOME pada system variable dengan value direktori instalasi Zulu/zulu-8
		* Cek instalasi pada Command Prompt dengan perintah `java -version`

	* Linux dan macOS
		* Instalasi SDKMAN
			* Instal Curl
				```cmd
				sudo apt install curl
				curl -version
				```
				Untuk macOS bisa menggunakan homebrew
				```cmd
				brew install curl
				```
			* Instal SDKMAN
				```cmd
				curl -s "https://get.sdkman.io" | bash
				source "$HOME/.sdkman/bin/sdkman-init.sh"
				sdk version // SDKMAN 5.11.0+644
				```


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