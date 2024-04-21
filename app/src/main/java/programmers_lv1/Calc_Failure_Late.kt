package programmers_lv1

private fun solution(N: Int, stages: IntArray): IntArray {
    var answer = intArrayOf()

    val tryStages = (1..N).toList().map { stage ->
        stages.filter { it == stage }
    }

    tryStages.mapIndexed { index, ints ->
        if (ints.isEmpty()) {
            listOf(0)
        } else {
            tryStages[index]
        }
    }.run { this.mapIndexed { index, ints ->
        Pair((this.drop(index).sumOf { it.count() }.toDouble() / this[index].count { it == index + 1 }),index + 1)
    }.sortedBy { it.first }.map { it.second }.also { answer += it } }

    return answer
}

fun main() {
    val testA = intArrayOf(2, 1, 2, 6, 2, 3, 3, 4)

    println(solution(5, testA).toList())

}