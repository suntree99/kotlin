package data

class Person{
    var firstName: String = ""
    var middleName: String? = null
    var lasttName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }

//    fun sayHello(name: Int) {
//        println("Hello $name, my name is $firstName")
//    }

    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, my name is $firstName")
    }

    fun run(){
        println("I'm RUn")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lasttName"
    }
}