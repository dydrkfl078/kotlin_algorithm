package programmers_lv1

private fun solution(new_id: String): String {
    var answer: String = ""

    var step1 = new_id.lowercase()

    var step2 = step1.filter {
        listOf<Char>('.', '-', '_').contains(it) || ('a'..'z').contains(it) || ('0'..'9').contains(
            it
        )
    }

    var step3 = step2

    while (step3.contains("..")) {
        step3 = step3.replace("..", ".")
    }


    var step4 = step3

    while (step4.first() == '.') {
        step4 = step4.drop(1)

        if (step4.isEmpty()) {
            break
        }
    }

    if (step4.isNotEmpty()) {
        while (step4.last() == '.') {
            step4 = step4.dropLast(1)

            if (step4.isEmpty()) {
                break
            }
        }
    }

    var step5 = step4.ifEmpty { "a" }

    var step6 = (if (step5.length > 15) step5.take(15) else step5)
    if (step6.last() == '.') {
        step6 = step6.dropLast(1)
    }

    var step7 = step6
    while (step7.length < 3) {
        step7 += step7.last()
    }

    answer = step7

    return answer
}

fun main() {
    val testA = "......."

    println(solution(testA))
}