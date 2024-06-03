package com.example.algorithm_programmers.lv0

private fun solution(num_list: IntArray, n: Int): List<List<Int>> {
    val answer: List<List<Int>> = num_list.toList().chunked(n)
    return answer
}

fun main() {
    println(solution(intArrayOf(1,2,3,4,5,6),2))
}