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
				Cek version, _contoh hasil : `SDKMAN 5.11.0+644`_
				```cmd
				sdk version
				```
		* Instal OpenJDK
			```cmd
			sdk install java 8.0.332-zulu
			```
			Cek version yang tersedia
			```cmd
			sdk list java
			```
			Untuk mengganti version gunakan perintah dibawah ini, _contoh version : `11.0.8-open`_
			```cmd
			sdk default java <another-version>
			```
			Cek version terkini, _contoh hasil : `Using java version 11.0.8-open`_
			```cmd
			sdk current java
			```

* Instalasi Gradle
	* Windows
		* Download dan Instal [binary-only or complete](https://gradle.org/releases/) dengan versi yang disarankan adalah `6.6`
		* Konfigurasi _Path_ pada system variable dengan value direktori instalasi Gradle\gradle-6.6\bin
		* Cek instalasi pada Command Prompt dengan perintah `gradle -v`

	* Linux dan macOS
		* Instal via SDKMAN
			```cmd
			sdk install gradle 6.6
			```
			Cek version yang tersedia
			```cmd
			sdk list gradle
			```
			Cek version terkini
			```cmd
			gradle -v
			```

* Instalasi IntelliJ IDEA
	* Requirement
		* Microsoft Windows 10/8/7/Vista/2003/XP (incl.64-bit) / macOS 10.8.3 atau lebih tinggi / GNOME atau KDE desktop
		* 2 GB RAM minimum, 4 GB RAM direkomendasikan
		* 1.5 GB ruang kosong pada penyimpanan
		* 1024x768 minimal resolusi layar
	* Dodol

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