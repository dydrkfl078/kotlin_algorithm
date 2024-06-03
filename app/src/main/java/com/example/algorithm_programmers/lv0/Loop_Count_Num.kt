package com.example.algorithm_programmers.lv0

private fun solution(array: IntArray): Int {
    var answer: String = ""
    array.forEach { answer += it.toString() }


    return answer.split("").count { it == "7" }
}

fun main() {
    val testA = intArrayOf(7, 77, 17)

    println(solution(testA))
}