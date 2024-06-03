package programmers_lv1

private fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()
    val strList = mutableListOf<String>()

    s.forEachIndexed { index, it ->
        val between = strList.lastIndexOf("$it")
        if ( between == -1) {
            answer += between
        } else {
            answer += index - between
        }
        strList.add("$it")
    }
    return answer
}

fun main() {
    val testA = "banana"

    println(solution(testA).toList())
}