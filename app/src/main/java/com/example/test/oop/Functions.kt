package com.example.test.oop

class Functions {
    fun sayHi() {
        println("Hi Bro")
    }

    fun sayHiTo(name: String) {
        println("Hi $name")
    }

    fun sayHiAndReturn(name: String): String {
        return "Hi to you $name this is new !"
    }

    fun multiply(num1: Int, num2: Int) {
        println("Multiply with Int $num1 x Int $num2 Result is : ${num1 * num2}")
    }

    fun multiply(num1: Int, num2: Double) {
        println("Multiply with Int $num1 x Double $num2 Result is : ${num1 * num2}")
    }

    fun multiply(num1: Double, num2: Int) {
        println("Multiply with Double $num1 x Int $num2 Result is : ${num1 * num2}")
    }

    fun multiply(num1: Double, num2: Double) {
        println("Multiply with Double $num1 x Double $num2 Result is : ${num1 * num2}")
    }
}

fun Int.multiplyExtension2(inputVal1: Int): Int {
    return this * inputVal1
}