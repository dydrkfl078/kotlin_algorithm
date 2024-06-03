package programmers_lv1

private fun solution(a: IntArray, b: IntArray): Int {
    return a.mapIndexed { index, i ->
        i * b[index]
    }.sum()
}

private fun solution2(a: IntArray, b: IntArray): Int {
    return a.zip(b).map {
        it.first * it.second
    }.sum()
}

fun main() {
    val testA = intArrayOf( 1,2,3,4,5,6)
    val testB = intArrayOf( 1,2,3,4,5,6)

    println(solution(testA,testB))
    println(solution2(testA,testB))
}