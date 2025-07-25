package com.example.test.oop

fun main() {
    val variable1 = 0;
    var unknownValue: String? = null

    unknownValue = " Test "

    if (unknownValue != null ){
        println("Value 1 : ${unknownValue.trim()}")
    } else {
        println("No Value")
    }

    unknownValue?.let {
        println("Value is : ${it.trim()}")
    }
}