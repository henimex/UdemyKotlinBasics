package com.example.test.oop.inheritance

class Palace(var towerCount: Int, concreteWindowCount: Int) : House(concreteWindowCount) {
    override fun price():String {
        return "This Palace Price is ${6000 * windowsCount}"
    }
}