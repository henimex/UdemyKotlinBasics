package com.example.test.oop.composition



fun main() {
    val c1 = Category(1,"Tech")
    val c2 = Category(2,"Dram")

    val d1 = Director(1,"Quantin T")
    val d2 = Category(2,"Brad Pit")

    val movie1 = Movie(1, "Django Unchaned", 2003, c2, d1 )

    println(movie1.movieId)
    println(movie1.movieName)
    println(movie1.movieYear)
    println(movie1.category.categoryName)
    println(movie1.director.directorName)
}