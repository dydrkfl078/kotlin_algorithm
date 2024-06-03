package programmers_lv2

import java.util.LinkedList
import java.util.Queue

private fun solution(priorities: IntArray, location: Int): Int {
    var answer = 0
    val mutablePriorities = mutableListOf<Int>()
    val a : Queue<Pair<Int,Int>> = LinkedList()

    priorities.forEachIndexed { index, i ->
        a.offer(i to index)
    }

    var count = 0
    var n = 0
    mutablePriorities.addAll(priorities.toList())
    mutablePriorities.sortDescending()

    while (a.isNotEmpty()) {
        var temp = a.poll()!!
        println("temp = $temp mutable priority[n] = ${mutablePriorities[n]}")
        if (temp.first == mutablePriorities[n] && temp.second == location){
            count++
            answer = count
            break
        } else if ( temp.first == mutablePriorities[n] ) {
            n++
            count ++
        } else {
            a.offer(temp)
        }
    }

    return answer
}

fun main() {
    val priorities = intArrayOf(1, 1, 9, 1, 1, 1)
    val location = 0

    println(solution(priorities, location))
}