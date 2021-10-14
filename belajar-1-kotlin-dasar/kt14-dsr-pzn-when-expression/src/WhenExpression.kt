fun main() {
    val predikat = "D"

    when (predikat) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        else -> {
            println("Bad")
        }

    }

    when (predikat) {
        "A", "B", "C" -> {
            println("Congratulation")
        }
        else -> {
            println("Sorry, You didn't pass")
        }
    }

    val passValue: Array<String> = arrayOf("A", "B", "C")
    when (predikat) {
        in passValue -> println("You pass the exam")
        !in passValue -> println("Sorry, You didn;t pass the exam")
    }

    val name = "Eko"
    when (name) {
        is String -> println("The name is valid")
        !is String -> println("The name is not valid")
    }

    val nilai = 60
    when {
        nilai > 90 -> println("Amazing")
        nilai > 75 -> println("Good")
        nilai > 60 -> println("Not Bad")
        else -> println("Try again")
    }
}