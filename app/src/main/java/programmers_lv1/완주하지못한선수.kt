package programmers_lv1

class 완주하지못한선수 {
    fun slution(participant: List<String>, completion: List<String> ): String {
        val participantMap = HashMap<String, Int>()

        participant.forEach {
            participantMap[it] = participantMap.getOrDefault(it, 0) + 1
        }

        completion.forEach { comple ->
            participantMap[comple] = participantMap[comple]!! - 1
        }

        return participantMap.filterValues { it != 0 }.keys.first()
    }
}

fun main() {
    val participant = listOf<String>("steve","james","poul","mark","rawler")
    val completion = listOf<String>("steve","poul","mark","rawler")
    val solution = 완주하지못한선수()
    println(solution.slution(participant, completion))
}