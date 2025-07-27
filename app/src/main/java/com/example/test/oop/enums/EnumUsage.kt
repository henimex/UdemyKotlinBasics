package com.example.test.oop.enums

fun main() {
    calcPrice(4, ProductSize.LARGE)
}

fun calcPrice(quantity:Int, size: ProductSize){
    when(size) {
        ProductSize.SMALL -> println("Total Price : ${quantity * 30} TL")
        ProductSize.MEDIUM -> println("Total Price : ${quantity * 40} TL")
        ProductSize.LARGE -> println("Total Price : ${quantity * 50} TL")
    }
}