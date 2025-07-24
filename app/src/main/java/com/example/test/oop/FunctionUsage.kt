package com.example.test.oop

fun main() {
    val foo = Functions()

    foo.sayHi();

    foo.sayHiTo("Henimex")

    println(foo.sayHiAndReturn("Joseph"))

    val num1: Int = 6
    val num2: Int = 11
    val num3: Double = 9.98
    val num4: Double = 64.9

    foo.multiply(num4, num1);
    foo.multiply(num2, num1);
    foo.multiply(num1, num3);
    foo.multiply(num4, num1);

    val result1 = 5.multiplyExtension(6);
    println("Result 1 Extension: $result1")

    val result2 = 5 multiplyExtensionFor2 2
    println("Result 2 Infix: $result2")
}

//Extension Method
fun Int.multiplyExtension(inputVal1: Int): Int {
    return this * inputVal1
}

infix fun Int.multiplyExtensionFor2(inputVal1: Int): Int {
    return this * inputVal1
}
