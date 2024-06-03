package programmers_lv1

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    var answer: IntArray = intArrayOf()

    report.toSet().map {
        it.split(" ").run { this.first() to this.last() }
    }.run {

        val freezeList = id_list.filter { str ->
            this.count { it.second  == str } >= k
        }

        id_list.forEach { id ->
            answer += this.count { it.first == id && freezeList.contains(it.second) }
        }

        println(this)
    }


    return answer
}

fun main() {
    val testIdList = arrayOf("muzi", "frodo", "apeach", "neo")
    val testReport = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")

    println(solution(testIdList,testReport,2).toList())
}