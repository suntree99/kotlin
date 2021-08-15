package data

class Application (val name: String){

//    object Utilities {
//        var name: String = "My Utilities"
//
//        fun toUpper(value: String): String {
//            return value.toUpperCase()
//        }
//    }

    companion object {
        var name: String = "My Utilities"

        fun toUpper(value: String): String {
            return value.toUpperCase()
        }
    }

}