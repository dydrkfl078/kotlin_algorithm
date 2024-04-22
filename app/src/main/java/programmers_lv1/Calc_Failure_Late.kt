package programmers_lv1

private fun solution(N: Int, stages: IntArray): IntArray {
    var answer = intArrayOf()

    val tryStages = (1..N+1).toList().map { stage ->
        stages.filter { it == stage }
    }

    tryStages.mapIndexed { index, ints ->
        Pair(tryStages.drop(index).sumOf { it.count() } / ints.count().toDouble(), index + 1)
    }.take(N).sortedBy { it.first }.map { it.second }.also { answer += it }

    return answer
}

fun main() {
    val testA = intArrayOf(2, 1, 2, 6, 2, 3, 3, 4)
//    val testB = intArrayOf(1,1,2,2)

    println(solution(5, testA).toList())
//    println(solution(3, testB).toList())

}