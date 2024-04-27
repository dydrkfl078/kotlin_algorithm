package programmers_lv1
private fun solution(survey: Array<String>, choices: IntArray): String {
    var answer: String = ""

    survey.mapIndexed { index, str ->
        if ( choices[index] > 4) {
            str.last() to choices[index] - 4
        } else if ( choices[index] < 4) {
            str.first() to 4 - choices[index]
        } else {
            '0' to 0
        }
    }.run {
        println(this)

        var caseNA = mutableListOf<Pair<Char,Int>>(Pair('A',0))
        var caseCF = mutableListOf<Pair<Char,Int>>(Pair('C',0))
        var caseMJ = mutableListOf<Pair<Char,Int>>(Pair('J',0))
        var caseRT = mutableListOf<Pair<Char,Int>>(Pair('R',0))

        for (i in this.indices) {
            when ( this[i].first) {
                'A', 'N' -> caseNA.add(this[i])
                'C', 'F' -> caseCF.add(this[i])
                'M', 'J' -> caseMJ.add(this[i])
                'R', 'T' -> caseRT.add(this[i])
            }
        }
        
        // todo maxByOrNull로 합계를 계산하지 않는 문제. 합계 후 maxBy 수행할 것
        listOf(caseRT,caseCF,caseMJ,caseNA).forEach {
            it.sortedBy { it.first }.maxByOrNull { it.second }.let { answer += it!!.first }
        }
    }

    return answer
}


fun main() {
    val testSurvey = arrayOf("NA","AN","RT","RT","CF","FC","MJ","JM")
    val testChoices = intArrayOf(4,4,4,4,4,4,4,4)

    println(solution(testSurvey,testChoices))
}