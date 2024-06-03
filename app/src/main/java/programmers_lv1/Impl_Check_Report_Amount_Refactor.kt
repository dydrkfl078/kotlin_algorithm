package programmers_lv1

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val reportMap = HashMap<String, MutableSet<String>>()
    val countMap = HashMap<String, Int>()

    // 신고 정보를 기반으로 한 데이터 구조 생성
    report.forEach {
        val (reporter, reported) = it.split(" ")
        reportMap.getOrPut(reported) { mutableSetOf() }.add(reporter)
    }

    // 신고당한 횟수 계산
    reportMap.forEach { (_, reporters) ->
        if (reporters.size >= k) {
            reporters.forEach { reporter ->
                countMap[reporter] = countMap.getOrDefault(reporter, 0) + 1
            }
        }
    }

    // 결과 배열 생성
    return id_list.map { id ->
        countMap.getOrDefault(id, 0)
    }.toIntArray()
}