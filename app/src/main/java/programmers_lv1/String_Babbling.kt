package programmers_lv1

import java.lang.Exception

private fun solution(babbling: Array<String>): Int {
    var answer: Int = 0

    babbling.forEach {
        it.replace("aya","1")
            .replace("ye","2")
            .replace("woo","3")
            .replace("ma","4")
            .run {
                try {
                    this.toInt().also {
                        if ( !it.toString().contains("11") && !"$it".contains("22") && !"$it".contains("33") && !"$it".contains("44")) {
                            answer ++
                        }
                    }
                } catch (_: Exception) {
                    println("Fail")
                }
            }
    }
    return answer
}

fun main() {
    val testA = arrayOf("ayaye", "yewooye", "yeye", "yemawoo", "ayaayaa")

    println(solution(testA))
}