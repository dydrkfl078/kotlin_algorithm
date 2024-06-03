package com.example.algorithm_programmers.lv0

import kotlin.math.abs

private fun solution(dots: Array<IntArray>): Int {
    var point1: Pair<Int,Int> = Pair(dots[0][0],dots[0][1])

    var width = 0
    var height = 0

    for ( i in dots.indices) {
        if ( point1.first != dots[i][0] && point1.second == dots[i][1]){
            width = abs(point1.first - dots[i][0])
        } else if ( point1.first == dots[i][0] && point1.second != dots[i][1]){
            height = abs(point1.second - dots[i][1])
        }
    }

    var answer: Int = width * height
    return answer
}

fun main() {
    val solu = arrayOf(intArrayOf(-1,-1), intArrayOf(1,1), intArrayOf(-1,1),intArrayOf(1,-1))
    print(solution(solu))

}