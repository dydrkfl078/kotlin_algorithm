package com.example.algorithm_programmers.lv1

private fun solution(dots: Array<IntArray>): Int {
    var answer = 0

    (dots.indices).map { dotA ->
        var excluedDotA = dots.filterIndexed { index, _ -> index !=dotA }
        excluedDotA.mapIndexed { dotBIndex, dotB ->
            var line = listOf(dots[dotA], dotB)
            var otherLine = excluedDotA.filterIndexed { index, _ -> index != dotBIndex }

            println("line = ${line[0].toList()}, ${line[1].toList()} other = ${otherLine[0].toList()}, ${otherLine[1].toList()}")
            fun inclination(arr : List<IntArray>): Double {
                var x = arr[1][0].toDouble() - arr[0][0].toDouble()
                var y = arr[1][1].toDouble() - arr[0][1].toDouble()

                return y / x
            }

            println("${inclination(line) } ${inclination(otherLine)}")
            if (inclination(line) == inclination(otherLine)) {
                answer = 1
            }
        }
    }
    return answer
}


fun main() {

    var testA = arrayOf(intArrayOf(10, 1), intArrayOf(9, 3), intArrayOf(2, 2), intArrayOf(4, 4))

    println(testA.filterIndexed { index, ints -> index != 0})
    var testB = arrayOf(intArrayOf(1, 4), intArrayOf(9, 2), intArrayOf(1, 4), intArrayOf(9, 2))
    solution(testA)
}