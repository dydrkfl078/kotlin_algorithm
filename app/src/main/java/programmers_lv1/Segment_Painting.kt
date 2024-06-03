package programmers_lv1

private fun solution(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0

    val sectionList : MutableList<Int> = section.toMutableList()

    while (sectionList.isNotEmpty()) {
        val scope = sectionList[0]

        sectionList.removeAll { (scope until scope+m).contains(it) }
        answer++
    }
    return answer
}

fun main() {
    val n = 8
    val m = 4
    val section = intArrayOf(2,3,6,9)

    println(solution(n, m, section))
}