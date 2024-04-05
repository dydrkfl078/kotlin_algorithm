package com.example.algorithm_programmers.lv1

private fun solution(board: Array<IntArray>): Int =
    board.indices.map { row ->
        board[row].indices.filter { board[row][it] == 1 }.forEach { col ->
            ((row - 1).coerceAtLeast(0)..(row + 1).coerceAtMost(board.lastIndex)).map { row2 ->
                ((col - 1).coerceAtLeast(0)..(col + 1).coerceAtMost(board.first().lastIndex)).forEach { col2 ->
                    if (board[row2][col2] == 0)
                        board[row2][col2] = 2
                }
            }
        }
    }.run { board.indices.map { board[it].count { value -> value == 0 } } }.sum()

fun main() {

    var testB = arrayOf(intArrayOf(0,0,0,0,0), intArrayOf(0,0,0,0,0),
        intArrayOf(0,0,0,0,0), intArrayOf(0,0,1,1,0),
        intArrayOf(0,0,0,0,0),
    )
    var testA =
        arrayOf(intArrayOf(0, 0, 1, 0, 1), IntArray(5), IntArray(5), IntArray(5), IntArray(5))

    var testC = arrayOf(intArrayOf(1,0,0), intArrayOf(0,1,0), intArrayOf(1,1,1))
    var testD = arrayOf(intArrayOf(1))
    var testE = arrayOf(intArrayOf(0,0), intArrayOf(0,0))
    solution(testA)::also{ println("A : $it") }
    solution(testB)::also{ println("B : $it") }
    solution(testC)::also{ println("C : $it") }
    solution(testE)::also{ println("E : $it") }
}