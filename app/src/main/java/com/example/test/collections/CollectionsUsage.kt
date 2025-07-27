package com.example.test.collections

fun main() {
    val student1 = Student(747,"Ali", "5B")
    val student2 = Student(656,"Ahmet", "5A")
    val student3 = Student(281,"Derya", "4B")
    val student4 = Student(104,"Fulya", "2A")

    val students = ArrayList<Student>()

    students.add(student1)
    students.add(student2)
    students.add(student3)
    students.add(student4)

    for (item in students){
        println("Student Name : [${item.no}] ${item.name} \tin class ${item.classroom}")
    }

    val sorted1 = students.sortedWith(compareBy { it.no })
    val sorted2 = students.sortedWith(compareByDescending { it.no })
    val sorted3 = students.sortedWith(compareBy { it.name })

    for ((i, item) in sorted1.withIndex()){
        println("Sort 1: ${item.name} \tSort 2: ${sorted2[i].name} \tSort 3: ${sorted3[i].name}")
    }

    val filtered = students.filter { it.name.contains("y") }
    println(filtered)
}