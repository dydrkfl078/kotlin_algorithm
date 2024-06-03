package basic

private fun solution (num_list: IntArray): Int {
    var oddNumResult = ""
    var evenNumResult = ""
    num_list.filter { it % 2 == 1 }.map { oddNumResult += it.toString() }
    num_list.filter { it % 2 == 0 }.map { evenNumResult += it.toString() }
    var answer: Int = oddNumResult.toInt() + evenNumResult.toInt()
    return answer
}

fun main() {
    val testA = intArrayOf(3,4,5,2,1)

    println(solution(testA))
}