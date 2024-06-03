package basic

private fun solution ( arr : IntArray, divisor: Int ): IntArray {
    var answer = arr.filter { it % divisor == 0 }
    if (answer.isEmpty()) {
        answer = listOf(-1)
    }

    return answer.toIntArray().sortedArray()
}