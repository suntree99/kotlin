package data

class Student(val name: String, val age: Int) {

}

fun Student?.sayHello(name: String) {
    if(this != null) {
        println("Hello $name, may name is ${this.name}, my age is ${this.age}")
    }
}

val Student.upperName : String
    get() = this.name.toUpperCase()