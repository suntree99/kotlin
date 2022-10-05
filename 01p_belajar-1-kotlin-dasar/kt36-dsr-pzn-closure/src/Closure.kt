fun main() {

    var counter: Int = 0

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()

    println(counter)
}