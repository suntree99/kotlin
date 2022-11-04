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

* Method toString()
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

* Method equals()
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