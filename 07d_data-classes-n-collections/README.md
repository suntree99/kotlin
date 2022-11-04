# Data Classes and Collections

## Data Class
* Deklarasi Data Class
    ```kotlin
    data class User(val name : String, val age : Int)
    ```
    _Dari kode di atas, kompiler akan menghasilkan `constructor`, `toString()`, `equals()`, `hashCode()`, `copy()` dan juga fungsi `componentN()`._
    * Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
    * Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
    * Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.

* Method *toString()*
    ```kotlin
    class User(val name : String, val age : Int)
    
    data class DataUser(val name : String, val age : Int)
    
    fun main(){
        val user = User("nrohmen", 17)
        val dataUser = DataUser("nrohmen", 17)
        
        println(user) // oo.User@4d7e1886
        println(dataUser) // DataUser(name=nrohmen, age=17)
    }
    ```
    _Method toString() pada Data Class langsung menampilkan properti dan juga nilainya_
    * _Untuk Class kita harus membuat method toString() secara manual agar menghasilkan data yang serupa_
    ```kotlin
    class User(val name : String, val age : Int){
    
        override fun toString(): String {
            return "User(name=$name, age=$age)"
        }
    }

    fun main(){
        val user = User("nrohmen", 17)

        println(user) // User(name=nrohmen, age=17)
    }
    ```

* Method *equals()*
    ```kotlin
    // Pada Data Class
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
 
    println(dataUser.equals(dataUser2)) // true
    println(dataUser.equals(dataUser3)) // false

    // Pada Class
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)
 
    println(user.equals(user2)) // false
    println(user.equals(user3)) // false
    ```
    _Method equals() pada Data Class langsung membandingkan properti dan nilainya, sedangkan pada Class akan membandingkan lokasi object pada memory_
    * _Untuk Class kita perlu membuat method equals() secara manual agar menghasilkan data yang serupa_
    ```kotlin
    class User(val name : String, val age : Int){
 
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false
    
            other as User
    
            if (name != other.name) return false
            if (age != other.age) return false
    
            return true
        }
    
        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + age
            return result
        }
    }
    ```

* Method *copy()*
    ```kotlin
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
 
    // Menyalin semua
    val dataUser4 = dataUser.copy()
    println(dataUser4) // DataUser(name=nrohmen, age=17)

    // Menyalin dan memodifikasi
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5) // DataUser(name=nrohmen, age=18)
    ```

* Method *component()*
    ```kotlin
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old") // My name is nrohmen, I am 17 years old
    ```
    ```kotlin
    val dataUser = DataUser("nrohmen", 17)
    val (name, age) = dataUser
 
    println("My name is $name, I am $age years old") // My name is nrohmen, I am 17 years old
    ```

* Behaviour pada Data Class
    ```kotlin
    data class DataUser(val name : String, val age : Int){
        fun intro(){
            println("My name is $name, I am $age years old")
        }
    }

    fun main(){
        val dataUser = DataUser("nrohmen", 23)
        dataUser.intro() // My name is nrohmen, I am 17 years old
    }
    ```

## List
* Deklarasi List
    ```kotlin
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5) // List<Int>
    ```
    ```kotlin
    val numberList = listOf(1, 2, 3, 4, 5) // List<Int>
    val charList = listOf('a', 'b', 'c') // List<Char>
    ```
    ```kotlin
    val anyList = listOf('a', "Kotlin", 3, true, User()) // List<Any>
    ```
    * Mengakses kompnen list dengan index
    ```kotlin
    println(anyList[3]) // true
    ```
    * Secara default List bersifat immutable, namun kita bisa membuat list yang mutable dengan _mutableListOf_
    ```kotlin
    val anyList = mutableListOf('a', "Kotlin", 3, true, User())

    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0
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