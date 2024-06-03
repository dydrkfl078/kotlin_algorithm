package programmers_lv1

import java.util.LinkedList
import java.util.Stack

private fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0

    val queueList = board[0].indices.map { colIndex ->
        LinkedList(board.map { it[colIndex] }.filter { it != 0 })
    }.toMutableList()

    var basket = Stack<Int>()

    moves.forEach {
        queueList[it-1].poll()?.let { num ->
            if ( basket.isEmpty()) {
                basket.push(num)
            } else if (basket.peek() == num) {
                basket.pop()
                answer+= 2
            } else {
                basket.push(num)
            }
        }
    }
    return answer
}

fun main() {
    val testboardA = arrayOf(intArrayOf(0,0,0,0,0), intArrayOf(0,0,1,0,3), intArrayOf(0,2,5,0,1),
        intArrayOf(4,2,4,4,2), intArrayOf(3,5,1,3,1))

    val testMovesA = intArrayOf(1,5,3,5,1,2,1,4)

    println(solution(testboardA,testMovesA))
}