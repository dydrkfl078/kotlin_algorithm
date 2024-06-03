package com.example.algorithm_programmers.lv0

private fun solution (polynomial : String):String {
    var answer = ""
    var x = 0
    var constant = 0
    val el = polynomial.split(" ")
    el.filter { it.contains("x") }.forEach {
        when (it.length) {
            1 -> { x++}
            else -> { x += it.replace("x","").toInt()}
        }
    }

    el.filterNot { it.contains("x") || it.contains("+")}.forEach {
        constant += it.toInt()
    }

    println("x = $x , constant = $constant")

    if ( constant != 0 && x != 0) {
        answer = "${if (x == 1){ "" }else {x}}x + $constant"
    } else if ( x == 0 && constant >= 1) {
        answer = constant.toString()
    } else if ( constant == 0 && x >= 1){
        answer = "${if (x == 1){ "" }else {x}}x"
    }

    return answer
}

fun main() {
    var testA = "x"
    println(solution(testA))
}