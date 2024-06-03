package com.example.algorithm_programmers.lv0

private fun solution(n: Int, numlist: IntArray): IntArray {
    var answer = numlist.filter { it % n == 0 }
    return answer.toIntArray()
}

fun main() {
    solution(3, intArrayOf(3,4,5,6,7,8,9)).forEach {
        println(it)
    }
}