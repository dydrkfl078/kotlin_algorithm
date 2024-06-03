package com.example.algorithm_programmers.lv0

private fun solution(numbers: String): Long {
    var numbers = numbers
    var numString = listOf<Pair<String, String>>(
        Pair("zero", "0"),
        Pair("one", "1"),
        Pair("two", "2"),
        Pair("three", "3"),
        Pair("four", "4"),
        Pair("five", "5"),
        Pair("six", "6"),
        Pair("seven", "7"),
        Pair("eight", "8"),
        Pair("nine", "9"),
    )
    for (index in numString) {
        numbers = numbers.replace(index.first, index.second)
        println(numbers)
    }

    return numbers.toLong()
}

fun main() {
    val testA = "onetwoonethreenineoneninetwo"
    val testB = "onetwoone"
    solution(testB)
}