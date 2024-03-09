package com.example.algorithm_programmers.lv1

// total 17 num 2 → [ 8, 9 ]
// https://school.programmers.co.kr/learn/courses/30/lessons/120923

private fun solution(num: Int, total: Int): MutableList<Int> {

    var answer : MutableList<Int> = mutableListOf()
    var startNum = -num
    var sum: Int? = null

    while (total != sum) {
        var count = 0
        sum = 0
        val list = mutableListOf<Int>()
        while (count <= num-1) {
            count++
            sum += startNum+count
            list.add(startNum+count)
            println(sum)
        }
        startNum++
        answer = list
    }

    return answer
}

fun main() {
    println(solution(5, 0))
}