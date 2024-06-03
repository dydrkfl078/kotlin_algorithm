package programmers_lv1

private fun solution(number: IntArray): Int {
    var answerList = mutableSetOf<List<Int>>()
    number.mapIndexed { index, i ->
        index to i
    }.run {
        this.mapIndexed { firstIndex, firstPair ->
            this.filterIndexed { firstIdx, _ -> firstIdx != firstIndex }.run {
                this.mapIndexed { secondIndex, secondPair ->
                    this.filterIndexed { secondIdx, _ -> secondIdx != secondIndex }.forEach {
                        if (firstPair.second + secondPair.second + it.second == 0) {
                            answerList.add(listOf(firstPair.first,secondPair.first,it.first).sorted())
                        }
                    }
                }
            }
        }
    }

    return answerList.count()
}

fun main() {
    val testA = intArrayOf(-3, -2, -1, 0, 1, 2, 3)

    println("결과는 ${solution(testA)}")
}