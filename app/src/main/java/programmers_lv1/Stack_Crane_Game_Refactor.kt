package programmers_lv1

import java.util.Stack

private fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    var stack = Stack<Int>()

    moves.forEach {
        for (i in board.indices) {
            if (board[i][it - 1] != 0) {
                if (stack.isNotEmpty() && stack.peek() == board[i][it - 1] ) {
                    stack.pop()
                    answer += 2
                } else {
                    stack.push(board[i][it - 1])
                }
                board[i][it - 1] = 0

                break
            }
        }
    }
    return answer
}

fun main() {
    val testboardA = arrayOf(
        intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 0, 3), intArrayOf(0, 2, 5, 0, 1),
        intArrayOf(4, 2, 4, 4, 2), intArrayOf(3, 5, 1, 3, 1)
    )

    val testMovesA = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)

    println(solution(testboardA, testMovesA))
}