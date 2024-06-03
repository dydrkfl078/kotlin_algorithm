package com.example.algorithm_programmers.lv0

private fun solution(array: IntArray, height: Int): Int {
    var answer: Int = array.filter { it > height }.size
    return answer
}

fun main() {
    print(solution(intArrayOf(165,150,170,180,189),167))
}