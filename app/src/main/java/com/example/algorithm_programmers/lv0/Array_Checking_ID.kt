package com.example.algorithm_programmers.lv0

private fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
    var answer: String = ""

    var container : List<Array<String>>? = db.filter { it[0]==(id_pw[0]) }
    answer = if ( container.isNullOrEmpty()) {
        "fail"
    } else {
        if (container[0][0] == id_pw[0] && container[0][1] == id_pw[1]) {
            "login"
        } else if (container[0][1] != id_pw[1]) {
            "wrong pw"
        } else {
            "fail"
        }
    }


    return answer
}

fun main() {
    println(solution(arrayOf("test","1111"), arrayOf(arrayOf("test3","1112"), arrayOf("test2","1111"))))
}