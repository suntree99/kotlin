package data

class MyData<T, U>(val firstData: T, val secondData: U){

    fun getData(): T = firstData

    fun getSeconc(): U = secondData

    fun printlnData() {
        println("Data is $firstData $secondData")
    }

}