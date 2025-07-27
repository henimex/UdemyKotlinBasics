package com.example.test.collections

fun main() {
    val numbers = ArrayList<Int>()
    val fruits = ArrayList<String>()

    fruits.add("Apple")
    fruits.add("Banana")
    fruits.add("Cherry")
    fruits.add("Orange")
    println(fruits)

    fruits[1] = "Fresh Banan"
    println(fruits)

    fruits.add(1,"Melon")
    println(fruits)

    println(fruits[2])
    println(fruits.get(2))

    println(fruits.size)
    println(fruits.count())
    println(fruits.isEmpty())
    println(fruits.contains("Cherry"))
    fruits.sort() // Default A-Z

    for ((i,item) in fruits.withIndex()){
        println("Result $i - $item")
    }

    fruits.removeAt(2)
    println(fruits)
    fruits.clear()
    println(fruits)
}