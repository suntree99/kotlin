package data

class Person{
    var firstName: String = ""
    var middleName: String? = null
    var lasttName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.firstName}")
    }

//    fun sayHello(name: Int) {
//        println("Hello $name, my name is $firstName")
//    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run(){
        println("I'm RUn")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lasttName"
    }
}