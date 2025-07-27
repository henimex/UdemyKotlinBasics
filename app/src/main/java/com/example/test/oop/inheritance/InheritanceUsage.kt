package com.example.test.oop.inheritance

fun main() {
    val topkapiSarayi = Palace(6,15)
    val tacMahal = Palace(13, 20)

    val villa1 = Villa(false, 10)
    val villa2 = Villa(true, 15)

    println("Topkapı Tower Count : ${topkapiSarayi.towerCount} and ${topkapiSarayi.price()}")
    println("TacMahal have ${tacMahal.windowsCount} windows and ${tacMahal.price()}")
    println("A villa with garage have ${villa2.windowsCount} windows ${villa2.price()}")
}