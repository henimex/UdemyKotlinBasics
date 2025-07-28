package com.example.test.collections

fun main() {
    val fruits = HashSet<String>()
    fruits.add("Apple")
    fruits.add("Cherry")
    fruits.add("Banana")
    println(fruits)
    println(fruits.elementAt(1))
    fruits.add("Orange")
    println(fruits)
    println(fruits.elementAt(1))
    fruits.remove("Apple")
    for (item in fruits){
        println(item)
    }

    for ((index,item) in fruits.withIndex()){
        println("$index - $item")
    }

    //HasMap
    val cities = HashMap<Int, String>()
    cities.put(26,"Eskisehir")
    cities.put(34,"Istanbul")
    cities.put(6,"Ankara")
    cities[16] = "Bursa"

    println(cities.get(26))
}