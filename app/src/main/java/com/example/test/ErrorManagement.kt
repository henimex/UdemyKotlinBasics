package com.example.test

fun main() {

    val a = 10
    val b = 0

    try {
        println("Result : ${a / b}")
    }catch (e : Exception){
        println("Cant Divide to Zero")
    }
}