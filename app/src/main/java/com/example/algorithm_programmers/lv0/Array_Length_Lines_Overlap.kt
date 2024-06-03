package com.example.algorithm_programmers.lv0

private fun solution(lines: Array<IntArray>): Int {
    var lineARange = lines[0][0]..lines[0][1]
    println("testA Range${lineARange}")
    var lineBRange = lines[1][0]..lines[1][1]
    var lineCRange = lines[2][0]..lines[2][1]

    var answer = 0
    if (lineARange.filter { lineBRange.contains(it) }.size >= 2
        && lineARange.filter { lineCRange.contains(it) }.size >= 2
        && lineBRange.filter { lineCRange.contains(it) }. size >= 2
    ) {
        var lineA = lineARange.filter { lineBRange.contains(it) || lineCRange.contains(it) }
        println("lineA = $lineA")
        var lineB = lineBRange.filter { lineCRange.contains(it) }
        println("lineB = $lineB")

        if (lineA.isNotEmpty() || lineB.isNotEmpty()) {
            val aLength = if (lineA.isNotEmpty()) {
                Math.abs(lineA.last() - lineA.first())
            } else {
                0
            }

            val bLength = if (lineB.isNotEmpty()) {
                Math.abs(lineB.last() - lineB.first())
            } else {
                0
            }
            val overlapLine = lineA.filter { lineB.contains(it) }
            val overlapLength = if (overlapLine.isNotEmpty()) {
                Math.abs(overlapLine.last() - overlapLine.first())
            } else {
                0
            }

            answer = aLength + bLength - overlapLength
            println("aLength = $aLength , bLength = $bLength overlapLeng = $overlapLength")
        }
        println("AB,BC,AC")
        return answer
    } else if (lineARange.filter { lineBRange.contains(it) }.size >= 2
        && lineARange.filter { lineCRange.contains(it) }.size < 2
        && lineBRange.filter { lineCRange.contains(it) }.size <2
    ) {
        var lineAB = lineARange.filter { lineBRange.contains(it) }
        val Length = if (lineAB.isNotEmpty()) {
            Math.abs(lineAB.last() - lineAB.first())
        } else {
            0
        }

        println("AB")
        answer = Length
        return answer
    } else if (lineARange.filter { lineBRange.contains(it) }.size >= 2
        && lineARange.filter { lineCRange.contains(it) }.size >= 2
        && lineBRange.filter { lineCRange.contains(it) }.size < 2){

        var lengthAB = lineARange.filter { lineBRange.contains(it) }
        var lengthAC = lineARange.filter { lineCRange.contains(it) }

        println("AB,AC")
        answer = Math.abs(lengthAB.last() - lengthAB.first()) + Math.abs(lengthAC.last() - lengthAC.first())
        return answer
    }
    else if (lineARange.filter { lineBRange.contains(it) }.size < 2
        && lineARange.filter { lineCRange.contains(it) }.size >= 2
        && lineBRange.filter { lineCRange.contains(it) }.size < 2
        ) {
        var lineAC = lineARange.filter { lineCRange.contains(it) }
        val Length = if (lineAC.isNotEmpty()) {
            Math.abs(lineAC.last() - lineAC.first())
        } else {
            0
        }

        println("AC")
        answer = Length
        return answer
    } else if (lineARange.filter { lineBRange.contains(it) }.size >= 2
        && lineARange.filter { lineCRange.contains(it) }.size < 2
        && lineBRange.filter { lineCRange.contains(it) }.size >= 2){

        var lengthAB = lineARange.filter { lineBRange.contains(it) }
        var lengthBC = lineBRange.filter { lineCRange.contains(it) }

        println("AB,BC")
        answer = Math.abs(lengthAB.last() - lengthAB.first()) + Math.abs(lengthBC.last() - lengthBC.first())
        return answer
    } else if (lineARange.filter { lineBRange.contains(it) }.size < 2
        && lineARange.filter { lineCRange.contains(it) }.size >= 2
        && lineBRange.filter { lineCRange.contains(it) }.size >= 2) {

        var lengthAC = lineARange.filter { lineCRange.contains(it) }
        var lengthBC = lineBRange.filter { lineCRange.contains(it) }


        println("AC,BC")

        answer = Math.abs(lengthAC.last() - lengthAC.first()) + Math.abs(lengthBC.last() - lengthBC.first())
        return answer

    }

    else {
        var lineBC = lineBRange.filter { lineCRange.contains(it) }
        val bLength = if (lineBC.isNotEmpty()) {
            Math.abs(lineBC.last() - lineBC.first())
        } else {
            0
        }

        println("BC")
        answer = bLength
        return answer
    }
}

fun main() {
    val testA = intArrayOf(0, 8)
    val testB = intArrayOf(0, 2)
    val testC = intArrayOf(6, 8)
    val lines = arrayOf(testA, testB, testC)


    println(solution(lines))
}