package com.example.algorithm_programmers.lv0

private fun solution ( x: Int ) : Boolean {
    return x % x.toString().split("").filter { it.isNotEmpty() }.map { it.toInt() }.sum() == 0
}

private fun solution2 (x: Int) : Boolean {
    return x % x.toString().sumOf { it.digitToInt() } == 0
}

fun main() {
    val testA = 10
    val testB = 1000


    println(solution2(testA))
    println(solution2(testB))

}