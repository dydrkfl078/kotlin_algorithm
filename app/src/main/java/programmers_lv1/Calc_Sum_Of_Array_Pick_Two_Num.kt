package programmers_lv1

private fun solution(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    var allCase = mutableListOf<List<Int>>()

    for ( removeIdx in numbers.indices) {
        allCase.add(numbers.filterIndexed { index, i ->
            index != removeIdx
        })

        allCase[removeIdx].forEach {
            answer += it + numbers[removeIdx]
        }
    }

    return answer.toSet().sorted().toIntArray()
}

fun main() {
    val testA = intArrayOf(2, 1, 3, 4, 1)
    val testB = intArrayOf(5, 0, 2, 7)

    println(solution(testA).toList())
    println(solution(testB).toList())

//    println(listOf(1,1,2,2,3,4,5,6,6,6,7,7,8).toSet())
}