package com.example.algorithm_programmers.lv1

import kotlin.math.abs

private fun solution(dots: Array<IntArray>): Int {
    var answer = 0

    (dots.indices-(dots.size-1)).map { dotA ->
        dots.filter { !it.contentEquals(dots[dotA]) }.map { dotB ->

            var line = listOf(dots[dotA], dotB)
            var outerLine = dots.filter { !it.contentEquals(line[0]) }.filter { !it.contentEquals(line[1]) }
            var lengthA_X = arrayOf<IntArray>(intArrayOf(Math.abs(line[0][0]-outerLine[0][0]),Math.abs(line[0][1]-outerLine[0][1])))
            var lengthA_Y = arrayOf<IntArray>(intArrayOf(Math.abs(line[0][0]-outerLine[1][0]),Math.abs(line[0][1]-outerLine[1][1])))
            var lengthB_X = arrayOf<IntArray>(intArrayOf(Math.abs(line[1][0]-outerLine[0][0]),Math.abs(line[1][1]-outerLine[0][1])))
            var lengthB_Y = arrayOf<IntArray>(intArrayOf(Math.abs(line[1][0]-outerLine[1][0]),Math.abs(line[1][1]-outerLine[1][1])))

            var compare = listOf( lengthA_X,lengthA_Y,lengthB_X,lengthB_Y)
            compare.forEachIndexed{ index, intArrays ->
                (compare.indices-index).map{
                    println("it = $it , compare[index] = ${compare[index][0].toList()}, compare[it] = ${compare[it][0].toList()}," )
                    if ( compare[index][0].contentEquals (compare[it][0])) {
                        answer = 1
                        println("answer = $answer")
                    }
                }
            }
            println(" lengthAX AY BX BY ${lengthA_X[0].toList()} ${lengthA_Y[0].toList()} ${lengthB_X[0].toList()} ${lengthB_Y[0].toList()}")
            println("${dotA} = ${line[0].toList()} ${line[1].toList()}")

        }
    }
    return answer
}


fun main() {

    var testA = arrayOf(intArrayOf(1, 4), intArrayOf(9, 2), intArrayOf(3, 8), intArrayOf(11, 6))
    solution(testA)
}