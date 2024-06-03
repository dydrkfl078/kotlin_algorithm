package programmers_lv1

import android.util.Log
import kotlin.math.max

private fun solution(answers: IntArray): IntArray {

    val student1 = intArrayOf(1, 2, 3, 4, 5)
    val student2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val student3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    var succees1 = 0
    var succees2 = 0
    var succees3 = 0

    answers.forEachIndexed { index, it ->
        if (it == student1[index  % student1.size]) {
            succees1++
        }

        if (it == student2[index  % student2.size]) {
            succees2++
        }

        if (it == student3[index  % student3.size]) {
            succees3++
        }
    }

    val students = intArrayOf(succees1, succees2, succees3)
    println(students.toList())
    var answer = intArrayOf()
    students.mapIndexed { index, i ->
        if (i == students.maxOrNull() && students.maxOrNull() != 0) {
            answer += index + 1
        }
    }

    return answer
}

fun main() {
    val testA = intArrayOf(1, 2, 3, 4, 5 , 2)
    val testB = IntArray(10000) { 3 }

//    solution(testA)
//    solution(testB)
    println(solution(testA).toList())
    println(solution(testB).toList())
}