package programmers_lv1

private fun solution(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0
    section.sort() // 구간을 시작 지점 기준으로 정렬

    var lastCover = -1 // 마지막으로 커버된 지점을 저장
    for (start in section) {
        if (start > lastCover) { // 현재 구간의 시작점이 마지막으로 커버된 지점보다 크면 새로운 구간이 필요함
            lastCover = start + m - 1 // 새로운 구간으로 커버할 수 있는 마지막 지점을 업데이트
            answer++ // 구간의 개수 증가
        }
    }
    return answer
}

fun main() {
    val n = 8
    val m = 4
    val section = intArrayOf(2,3,6,9)

    println(solution(n, m, section))
}