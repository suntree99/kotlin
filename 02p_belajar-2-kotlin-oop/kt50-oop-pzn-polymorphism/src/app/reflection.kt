package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validationRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterasi satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when (value) {
                is String -> {
                    if("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }

                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validationRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validationRequest(request2)
}

//fun validationRequest(request: CreateProductREquest) {
//    if (request.id == "") {
//        throw ValidationException("id is blank")
//    } else if (request.name == "") {
//        throw ValidationException("name is blank")
//    }
//}

//fun validationRequest(request: CreateCategoryRequest) {
//    if (request.id == "") {
//        throw ValidationException("id is blank")
//    } else if (request.name == "") {
//        throw ValidationException("name is blank")
//    }
//}