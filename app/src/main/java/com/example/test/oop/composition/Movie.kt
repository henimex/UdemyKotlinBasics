package com.example.test.oop.composition

data class Movie(
    var movieId: Int,
    var movieName: String,
    var movieYear: Int,
    var category: Category,
    var director: Director
) {
}

