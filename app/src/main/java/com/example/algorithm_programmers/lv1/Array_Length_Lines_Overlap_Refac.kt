package com.example.algorithm_programmers.lv1

private fun solution (arr : Array<IntArray>):Int{
    val table = IntArray(201)

    arr.forEach { for (i in it[0]+100 until it.last()+100){
        table[i]++
    } }

    println(table.toList())
    return table.count{ it >= 2}
}

fun main() {
    val testA = intArrayOf(0, 8)
    val testB = intArrayOf(0, 2)
    val testC = intArrayOf(6, 8)
    val lines = arrayOf(testA, testB, testC)

    println(solution(lines))
}