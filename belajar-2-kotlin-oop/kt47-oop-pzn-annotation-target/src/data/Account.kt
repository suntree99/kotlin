package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is Called")
        "Eko"
    }

    var description: String by Delegates.observable(description){
        property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}