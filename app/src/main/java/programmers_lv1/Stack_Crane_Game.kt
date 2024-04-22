package programmers_lv1

import java.util.LinkedList
import java.util.Queue
import java.util.Stack

private fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0

    var queueList = mutableListOf<Queue<Int>>()
    var basket = Stack<Int>()

    for (i in board.indices) {
        var stack = LinkedList<Int>()

        board.forEach {
            if (it[i] != 0) {stack.add(it[i])}
        }

        queueList.add(stack)
    }

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