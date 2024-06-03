package programmers_lv1

private fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    return signs.mapIndexed { index, b ->
        if (!b) -(absolutes[index]) else absolutes[index]
    }.sum()
}

private fun solution2(absolutes: IntArray, signs: BooleanArray): Int {
    return absolutes.foldIndexed(0) {index, acc, i ->
        acc + if (signs[index]) i else -i
    }
}

fun main() {
    val testA = intArrayOf(4,7,12)
    val testSign = booleanArrayOf(true,false,true)

    println(solution2(testA,testSign))
}
