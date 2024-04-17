package programmers_lv1

private fun solution(n: Long): Long {
    val sqrt = Math.sqrt(n.toDouble())
    return if ( sqrt == sqrt.toInt().toDouble()) {
        ((sqrt+1) * (sqrt+1)).toLong()
    } else {
        -1
    }
}

fun main() {
    val testA = 17L
    val testB = intArrayOf(1,2,3)

    testB.indexOf(3)

    println(solution(testA))
}