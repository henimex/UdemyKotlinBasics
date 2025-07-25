package com.example.test.homeworks.day2

class HomeWork2 {

    //Homework 1-1
    fun convertKmToMile(km: Int): String {
        val oneMiles = 0.621
        return "$km KM is Equals to ${km * 0.621} Miles"
    }

    //Homework 1-2
    fun calcRectangularArea(width: Double, length: Double): String {
        return "Rectangular Width: $width Length: $length and the area is: ${length * width}"
    }

    //Homework 1-3
    fun calFactorial(number: Int): String {
        var result = 1L
        for (i in 2..number) {
            result *= i
        }

        return "Factorial of $number is $result"
    }

    //Homework 1-4
    fun countChars(word:String) : String {
        val count = word.length
        return "$word has $count characters";
    }

    //Homework 2-1
    fun calculateAngelTotals(cornerCount: Int): String {
        return "A $cornerCount-sided shape has ${(cornerCount - 2) * 180} of interior angles."
    }

    //Homework 2-2
    fun calculateSalary(workedDays: Int, extraHours: Int): String {

        val maxWorkHours = 8;
        val normalSalary = 40
        val extraSalary = 80
        val extraLimit = 150

        val salaryPayment = (maxWorkHours * normalSalary) * workedDays
        var extraPayment = 0
        if ((workedDays * maxWorkHours) > extraLimit) {
            extraPayment = extraHours * extraSalary
            return "Salary \t: $salaryPayment TL \nExtra \t: $extraPayment TL \nTotal \t: ${salaryPayment + extraPayment} TL"
        } else {
            return "------------------------------ \nSalary \t: $salaryPayment TL \nExtra \t: No Extra Payment \nTotal \t: $salaryPayment TL \n------------------------------"
        }
    }

    //Homework 2-3
    fun calculateParkinPrice(parkingHours: Int): String {
        val hourPrice = 50
        val additionalPrice = 10
        val addAfterHours = 1

        return if (parkingHours <= addAfterHours) {
            "$parkingHours hour/s Parking Price : ${hourPrice * addAfterHours}"
        } else {
            "$parkingHours hour/s Parking Price : ${(hourPrice * addAfterHours) + ((parkingHours - addAfterHours) * additionalPrice)}"
        }
    }
}