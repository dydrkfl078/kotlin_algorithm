package basic

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    arr1.mapIndexed { index, ints ->
        ints.mapIndexed { intsIndex, i ->
            arr2[index][intsIndex] += i
        }
    }

    return arr2
}

fun main() {
    val testA = arrayOf(intArrayOf(1,2), intArrayOf(2,3))
    val testB = arrayOf(intArrayOf(3,4), intArrayOf(5,6))

    val testC = arrayOf(intArrayOf(1,2))
    val testD = arrayOf(intArrayOf(3,4))

    solution(testA,testB).forEach { println(it.toList()) }
    solution(testC,testD).forEach { println(it.toList()) }

    val testArr = (50..100).toList().toIntArray()
    println(testFun2(testArr,51))
}

fun testFun2(n: IntArray, target: Int): Int {
    var left = 0
    var right = n.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        val midValue = n[mid]

        when {
            midValue == target -> return mid + 1
            midValue < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}