package com.example.test.giris

fun main() {

    val day = 5

    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("No Such Day")
    }

    for (i in 1..7 ){
        println("Loop : $i")
    }

    for (i in 10..50 step 5 ){
        println("Step Loop : $i")
    }

    for (i in 100 downTo 70 step 5 ){
        println("Down Step Loop : $i")
    }

    val dataList = ArrayList<String>()
    dataList.add("Apple")
    dataList.add("Orange")
    dataList.add("Banana")
    dataList.add("WaterMelon")


    for (i in 0 until dataList.size){
        println("List of item index is $i and the item is : ${dataList[i]}")
    }

    var counter = 1;

    while (counter < 6){
        println("While Loop : $counter")
        counter++
    }

    for(i in 1 .. 10){
        if (i == 3) {
            println("Go To Head Start Again Loop Counter is $i")
            continue
        }

        if (i == 8){
            println("Loog Counter On $i its a break.")
            break
        }

        println("I Don't give a shit it will see me at the end. index is $i")
    }
}