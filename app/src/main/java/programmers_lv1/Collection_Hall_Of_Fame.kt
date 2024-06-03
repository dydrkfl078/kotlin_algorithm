package programmers_lv1

private fun solution(k: Int, score: IntArray): IntArray {
    var fameList = mutableListOf<Int>()

    return score.map {
        fameList.add(it)
        fameList.sortDescending()

        println(fameList)
        if (fameList.size > k) {
            fameList.removeLast()
            fameList.last()
        } else {
            fameList.last()
        }
    }.toIntArray()
}

fun main () {
    val testA = intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)

    println(solution(4,testA))
}