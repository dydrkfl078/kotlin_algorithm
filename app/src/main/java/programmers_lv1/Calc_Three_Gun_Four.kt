package programmers_lv1

private fun solution(number: IntArray): Int {
    var answer = 0
    var answerList = mutableSetOf<List<Int>>()

    number.mapIndexed { index, i ->
        number.filterIndexed { idx, secondI -> idx != index }.run {
            this.mapIndexed { secondIndex, second ->
                this.filterIndexed { secondIdx, _ -> secondIdx != secondIndex  }.forEach {
                    if (it + i + second == 0) {
                        answerList.add(listOf<Int>(it,i,second).sorted())
                    }
                }
            }
        }
    }

    var duplicationNum = number.groupBy { it }.filter { it.value.size > 1 }.map { it.key to it.value.count()-1 }

    println(duplicationNum)
    duplicationNum.forEach {n ->
        answerList.forEach {
            if (it.contains(n.first)) {
                answer += n.second
            }
        }
    }

    println(answerList)
    return answerList.count() + answer
}

fun main() {
    val testA = intArrayOf(0,0,0,0,0,0)

    println("결과는 ${solution(testA)}")
}