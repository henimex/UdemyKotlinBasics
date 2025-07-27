package com.example.test.oop.inheritance

fun main() {

    val home1 = House(16)

    val topkapiSarayi = Palace(6, 15)
    val tacMahal = Palace(13, 20)

    val villa1 = Villa(false, 10)
    val villa2 = Villa(true, 15)

    println("Topkapı Tower Count : ${topkapiSarayi.towerCount} and ${topkapiSarayi.price()}")
    println("TacMahal have ${tacMahal.windowsCount} windows and ${tacMahal.price()}")
    println("A villa with garage have ${villa2.windowsCount} windows ${villa2.price()}")

    checkStructure(villa1)
    checkStructure(topkapiSarayi)

    val upCasting: House = villa2
    val downCasting = home1 as Palace //this will couse crush becouse down casting is not available
//    downCasting.towerCount  = 66
//    println("${downCasting.price()}")
}

fun checkStructure(structure: House) {
    if (structure is Villa) {
        println("This is a Villa")
    } else if (structure is Palace){
        println("This is a Palace")
    } else {
        println("This structure is not a villa or palace.")
    }
}