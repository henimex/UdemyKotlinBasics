package com.example.test.oop

fun main() {

    val rentableCars = ArrayList<Car>()


    val rentableCar1 = Car("Red", 220, true)
    val rentableCar2 = Car("White", 110, true)
    val rentableCar3 = Car("Brown", 80, false)
    val rentableCar4 = Car("Blue", 130, true)

    rentableCar1.available = false

    rentableCars.add(rentableCar1)
    rentableCars.add(rentableCar2)
    rentableCars.add(rentableCar3)
    rentableCars.add(rentableCar4)

    for (i in 0 until rentableCars.size) {
        println("_____________Rentable Car ${i+1} State___________")
        println("Color          : ${rentableCars[i].color}")
        println("Max Speed      : ${rentableCars[i].maxSpeed}")
        println("State          : ${carState(rentableCars[i].available)}")
        println("")
    }
    rentableCar2.getInfo()
}

fun carState(state: Boolean): String {
    return when (state) {
        true -> "Its Available"
        false -> "Its Not Available"
    }
}