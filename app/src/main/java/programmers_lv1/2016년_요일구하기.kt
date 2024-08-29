package programmers_lv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

private fun solution(a: Int, b: Int): String {
    val stringDate = LocalDate.of(2016,a,b)
    return stringDate.dayOfWeek.toString().take(3)
}


fun main() {
    val a = 5
    val b = 24
    println(solution(a,b))
}


