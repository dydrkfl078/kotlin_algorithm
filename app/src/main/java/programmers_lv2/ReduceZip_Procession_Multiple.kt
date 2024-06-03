package programmers_lv2

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.mapIndexed { arr1index, arr1ints ->
        arr1ints.mapIndexed { index, i ->
            arr2[index].map {
                it * i
            }
        }.reduce { acc, ints ->
            acc.zip(ints) { sum, el ->
                sum + el
            }
        }.toIntArray()
    }.toTypedArray()
}

fun main() {
    val arr1 = arrayOf(intArrayOf(2, 3, 2), intArrayOf(4, 2, 4), intArrayOf(3, 1, 4))
    val arr2 = arrayOf(intArrayOf(5, 4, 3), intArrayOf(2, 4, 1), intArrayOf(3, 1, 1))

    println(solution(arr1, arr2))
}