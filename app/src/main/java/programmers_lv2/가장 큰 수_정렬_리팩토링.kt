package programmers_lv2

private fun solution(numbers: IntArray): String {
    // 숫자를 문자열로 변환하여 리스트에 저장
    val numStrs = numbers.map { it.toString() }

    // 문자열을 결합하여 비교하는 Comparator를 사용하여 정렬
    val sortedNums = numStrs.sortedWith(Comparator { a, b ->
        (b + a).compareTo(a + b)
    })

    // 스트링 빌더에 정렬된 숫자들을 추가
    val result = sortedNums.joinToString("")

    // 모든 숫자가 0인 경우를 처리
    return if (result.startsWith("0")) "0" else result
}

fun main() {
    val numbers = intArrayOf(3, 30, 34, 5, 9)

    println(solution(numbers))
}