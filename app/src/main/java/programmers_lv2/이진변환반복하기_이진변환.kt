package programmers_lv2

private fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()
    var convert = s.replace("0","")
    var removeCount = s.length - convert.length
    var remain = convert.length
    return answer
}

fun main() {
    val s = "110010101001"

    solution(s)
}