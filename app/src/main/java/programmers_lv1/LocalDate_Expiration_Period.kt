package programmers_lv1

import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.util.Date

private fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()

    val toDayInfo = today.split(".").map {
        it.removePrefix("0").toInt()
    }
    val dateToday = LocalDate.of(toDayInfo[0],toDayInfo[1],toDayInfo[2])

    val termsInfo = HashMap <String,Int>()
    terms.forEach {
        it.split(" ").run {
            termsInfo.put(this.first(),this.last().toInt())
        }
    }

    val privaciesInfo = privacies.map {
        it.split(" ").run {
            val dayInfo = this.first().split(".").map {str ->
                str.removePrefix("0").toInt()
            }

            LocalDate.of(dayInfo[0],dayInfo[1],dayInfo[2]) to it.last()
        }
    }

    println(termsInfo)
    println(privaciesInfo)

    privaciesInfo.forEachIndexed { index, it ->
        if (ChronoUnit.MONTHS.between(it.first,dateToday) >= termsInfo["${it.second}"]!!){
            answer += index + 1
        }
    }
    return answer
}

fun main() {
    var a = LocalDate.of(2020,5,2)
    var b = LocalDate.of(2021,11,2)

    println(ChronoUnit.MONTHS.between(a,b))

    val testToday = "2022.05.19"
    val testTerms = arrayOf("A 6", "B 12", "C 3")
    val testPrivacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")

    println(solution(testToday,testTerms,testPrivacies).toList())
}