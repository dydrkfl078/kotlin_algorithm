package basic

private fun solution(num_list: IntArray): IntArray {
    var answer: MutableList<Int> = num_list.toMutableList()
    var beforeLastEl = num_list.takeLast(2)[0]
    if (num_list.last() <= beforeLastEl ) {
        answer.add(num_list.last()*2)
    } else {
        answer.add(num_list.last()-beforeLastEl)
    }


    return answer.toIntArray()
}

fun main() {
    val testA = intArrayOf(2,1,6)

    println(solution(testA).toList())
}