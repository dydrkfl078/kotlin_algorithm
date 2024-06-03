package programmers_lv1

private     fun solution(arr: IntArray): Double {
    var answer = (arr.sum()).toDouble()/arr.size

//    arr.average()

    return answer
}

fun main() {
    val testA = intArrayOf(1,2,3,4)

    println(solution(testA))
}