package programmers_lv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

private fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()
    val dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
    val todayInfo = LocalDate.parse(today,dateFormatter)

    val termsInfo = HashMap <String,Int>()
    terms.forEach {
        it.split(" ").run {
            termsInfo.put(this.first(),this.last().toInt())
        }
    }

    privacies.forEachIndexed { index, str ->
        val expirationDate = LocalDate.parse(str.dropLast(2),dateFormatter)

        if (ChronoUnit.MONTHS.between(expirationDate,todayInfo) >= termsInfo["${str.last()}"] ?:999) {
            answer += index + 1
        }
    }

    return answer
}

fun main() {

    val testToday = "2022.05.19"
    val testTerms = arrayOf("A 6", "B 12", "C 3")
    val testPrivacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")

    println(solution(testToday,testTerms,testPrivacies).toList())
}