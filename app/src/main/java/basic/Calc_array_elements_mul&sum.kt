package basic

private fun solution(numList: IntArray): Int {
    var a = 1

    return numList.forEach { a = it * a }.run { if (numList.sum() * numList.sum() > a) 1 else 0 }
}

fun main() {
    var testA = intArrayOf(3, 4, 5, 2, 1)
    var testB = intArrayOf(5, 7, 8, 3)
    println(solution(testA))
}