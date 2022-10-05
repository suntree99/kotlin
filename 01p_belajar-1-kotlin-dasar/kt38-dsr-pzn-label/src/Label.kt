fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                break@loopI
            }
            println( "$i * $j = ${i*j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue
            }
            println( "$i * $j = ${i*j}")
        }
    }
}

fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

fun main() {
//    labelBreak()
//    labelContinue()
    test("") labelTest@ {
        if (it == "") {
            return@labelTest
        } else {
            println("Eko")
        }
    }
}