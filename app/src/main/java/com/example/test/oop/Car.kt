package com.example.test.oop

class Car(var color: String, var maxSpeed: Int, var available: Boolean) {

    init {
        println("[Object Constructor] ***** A New Car Has Been Created *****")
    }

    fun getInfo(){
        println("_______________Car Info_____________")
        println("Color          : $color")
        println("Max Speed      : $maxSpeed")
        println("State          : ${carState(available)}")
        println("")
    }
}