package programmers_lv1

private fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    val answer = IntArray(n)

    reserve.forEach {
        answer[it-1] = 1
    }

    lost.forEach {
        answer[it-1] -= 1
    }

    if ( answer.last() == 1 ) {
        answer[n-1] ++
        if (answer[n-2] == -1 ) {
            answer[n-2] ++
        }
    }


    if ( answer.first() == 1) {
        answer[0]++
        if (answer[1] == -1 ) {
            answer[0]++
            answer[1]++
        }
    }

    answer.forEachIndexed { index, i ->
        if (i == 1) {
            if (answer[index-1] == -1) {
                answer[index-1]++
                answer[index]++
            } else if (answer[index+1] == -1 ) {
                answer[index+1]++
                answer[index]++
            }
        }
    }

    println(" After : ${answer.toList()}")

    return answer.count { it >= 0 }
}

fun main() {
    val testLostA = intArrayOf(2,4)
    val testReserveA = intArrayOf(3)

    val testLostB = intArrayOf(2)
    val testReserveB = intArrayOf(1)

    val testLostC = (1..30).toList().toIntArray()
    val testReserveC = intArrayOf(2)

    println(solution(5,testLostA,testReserveA))
    println(solution(3,testLostB,testReserveB))
    println(solution(30,testLostC,testReserveC))
}