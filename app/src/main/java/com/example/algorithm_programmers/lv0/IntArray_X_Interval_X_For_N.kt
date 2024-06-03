package com.example.algorithm_programmers.lv0

private fun solution ( x: Int, n: Int): LongArray {
    var answer = mutableListOf<Long>()

    for (i in 1..n) {
        answer.add(i*x.toLong())
    }

    return answer.toLongArray()
}

fun main() {
    val testA = intArrayOf(-4,5)
    val testB = intArrayOf(5,5)
    val testC = intArrayOf(1,3)

    solution(testA[0],testA[1])
    solution(testB[0],testB[1])
    solution(testC[0],testC[1])
}