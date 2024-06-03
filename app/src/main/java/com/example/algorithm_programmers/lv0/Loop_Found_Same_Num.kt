package com.example.algorithm_programmers.lv0

private fun solution(array: IntArray, n: Int): Int {
    return array.filter { it == n }.count()
}

fun main() {
    val testA = intArrayOf(1,1,2,3,4,5)

    println(solution(testA,1))
}