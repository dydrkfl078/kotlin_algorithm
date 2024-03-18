package com.example.algorithm_programmers.lv1

// TODO 인덱스가 0 or Last일 경우 제외하고, 123일 경우 위아래 인덱스리스트 배열에 +1 해서 풀기

private fun solution(board: Array<IntArray>): Int {


    var boardLine = mutableListOf<MutableList<MutableList<Int>>>()
    for ((index, item) in board.withIndex()) {
        var boardSequence = mutableListOf<MutableList<Int>>()
        println(board.size - 1)
        println("index : $index")

        item.mapIndexed { bombIndex, i ->
            boardSequence.add(mutableListOf<Int>(bombIndex, i))

        }

        boardLine.add(boardSequence)
        println("boardLines${boardLine}")

    }

    var bombLocation = mutableListOf<List<List<Int>>>()
    for (line in boardLine) {
        bombLocation.add(line.filter { it[1] == 1 })
    }

    println(bombLocation
    )

    for ((index, item) in bombLocation.withIndex()) {

        for ( a in item.indices) {
            println("a : $a , item : ${item[a]}")
            when (index) {
                0 -> {
                    when (item[a].first()) {
                        0 -> {
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                             println("아래 한칸 , 대각선 오른쪽")
                            boardLine[index+1][item[a][0]][1] ++
                            boardLine[index+1][item[a][0]+1][1] ++
                        }
                        board.size - 1 -> {
                            println("test ${item[0].size -1}")
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                             println("아래 한칸 , 대각선 왼쪽")
                            boardLine[index+1][item[a][0]-1][1] ++
                            boardLine[index+1][item[a][0]][1] ++
                        }
                        else -> {
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                             println("아래, 대각선 좌,우")
                            boardLine[index+1][item[a][0]-1][1] ++
                            boardLine[index+1][item[a][0]][1] ++
                            boardLine[index+1][item[a][0]+1][1] ++
                        }
                    }

                    println("setSafe ${boardLine[index][item[a][0]][1]}")
                    println("setSafe ${boardLine[index][item[a][0]]}")

                }
                board.size - 1 -> {
                    when (item[a].first()) {
                        0 -> {
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                            println("위 한칸 , 대각선 오른쪽")
                            boardLine[index-1][item[a][0]][1] ++
                            boardLine[index-1][item[a][0]+1][1] ++
                        }
                        board.size - 1 -> {
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                            println("위 한칸 , 대각선 왼쪽")
                            boardLine[index-1][item[a][0]-1][1] ++
                            boardLine[index-1][item[a][0]][1] ++
                        }
                        else -> {
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                            println("위, 대각선 좌,우")
                            boardLine[index-1][item[a][0]-1][1] ++
                            boardLine[index-1][item[a][0]][1] ++
                            boardLine[index-1][item[a][0]+1][1] ++
                        }
                    }
                }

                else     -> {
                    when (item[a].first()) {
                        0 -> {
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                             println("아래 한칸 , 대각선 오른쪽")
                            boardLine[index+1][item[a][0]][1] ++
                            boardLine[index+1][item[a][0]+1][1] ++
                             println("위 한칸 , 대각선 오른쪽")
                            boardLine[index-1][item[a][0]][1] ++
                            boardLine[index-1][item[a][0]+1][1] ++
                        }
                        board.size - 1 -> {
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                             println("아래 한칸 , 대각선 왼쪽")
                            boardLine[index+1][item[a][0]-1][1] ++
                            boardLine[index+1][item[a][0]][1] ++
                             println("위 한칸 , 대각선 왼쪽")
                            boardLine[index-1][item[a][0]-1][1] ++
                            boardLine[index-1][item[a][0]][1] ++
                        }
                        else -> {
                            boardLine[index][item[a][0]-1][1] ++
                            boardLine[index][item[a][0]][1] ++
                            boardLine[index][item[a][0]+1][1] ++
                             println("아래, 대각선 좌,우")
                            boardLine[index+1][item[a][0]-1][1] ++
                            boardLine[index+1][item[a][0]][1] ++
                            boardLine[index+1][item[a][0]+1][1] ++
                             println("위, 대각선 좌, 우")
                            boardLine[index-1][item[a][0]-1][1] ++
                            boardLine[index-1][item[a][0]][1] ++
                            boardLine[index-1][item[a][0]+1][1] ++

                        }
                    }

                    println("setSafe ${boardLine[index][item[a][0]][1]}")
                    println("setSafe ${boardLine[index][item[a][0]]}")

                }
            }
        }
    }

    println(boardLine[0])
    println(boardLine[1])
    println(boardLine[2])
    println(boardLine[3])
    println(boardLine[4])


    var answer: Int = (board.size*board.size)

    for ( i in boardLine) {
        for ( j in i) {
            if ( j[1] >= 1) {
                answer--
            }
        }
    }

    println("answer : ${answer}")
    return answer
}

fun main() {

    var testB = arrayOf(intArrayOf(0,0,0,0,0), intArrayOf(0,0,0,0,0),
        intArrayOf(0,0,0,0,0), intArrayOf(0,0,1,1,0),
        intArrayOf(0,0,0,0,0),
    )
    var testA =
        arrayOf(intArrayOf(0, 0, 1, 0, 1), IntArray(5), IntArray(5), IntArray(5), IntArray(5))
    solution(testB)
}