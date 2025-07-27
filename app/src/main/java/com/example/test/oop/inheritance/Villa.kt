package com.example.test.oop.inheritance

class Villa(var haveGarage: Boolean, woodenWindowCount: Int): House(woodenWindowCount) {
    override fun price():String {
        var garageCost = 0
        if (haveGarage){
            garageCost = 600
        }
        return "This Villa Price is ${1000 * windowsCount + garageCost}"
    }
}