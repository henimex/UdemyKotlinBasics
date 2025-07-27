package com.example.test.oop.interfaces

fun main() {
    val user = WebPageUser()
    println(user.userId)
    user.foo()
    println(user.getUserIdForThis())
}