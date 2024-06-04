package programmers_lv2

private fun solution(citations: IntArray): Int {
    var answer = 0

    val a = citations.sortedDescending()

    // forEachIndexed 문으로 돌리고 싶은데, forEach는 원하는 값을 찾았을 때 중단이 불가능.
    for (i in a.indices) {
        if (a[i] > i) {
            answer++
        } else {
            break
        }
    }

    return answer
}

fun main() {
    val citations = intArrayOf(3,0,6,1,5)

    println(solution(citations))
}
