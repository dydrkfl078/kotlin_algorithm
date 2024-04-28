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
        var caseNA = mutableListOf<Pair<Char,Int>>(Pair('A',0))
        var caseCF = mutableListOf<Pair<Char,Int>>(Pair('C',0))
        var caseMJ = mutableListOf<Pair<Char,Int>>(Pair('J',0))
        var caseRT = mutableListOf<Pair<Char,Int>>(Pair('R',0))

        this.groupBy { it.first }.mapValues { (_, values) -> values.sumOf{it.second} }
            .forEach {
                when ( it.key ) {
                    'A','N' -> caseNA.add(Pair(it.key,it.value))
                    'C','F' -> caseCF.add(Pair(it.key,it.value))
                    'M','J' -> caseMJ.add(Pair(it.key,it.value))
                    'R','T' -> caseRT.add(Pair(it.key,it.value))
                }
            }

        listOf(caseRT,caseCF,caseMJ,caseNA).map {cases ->
            cases.sortedBy { it.first }.maxByOrNull { it.second }.let { answer += it!!.first }
        }
    }

    return answer
}


fun main() {
    val testSurvey = arrayOf("NA","AN","RT","RT","CF","FC","MJ","JM")
    val testChoices = intArrayOf(7,1,4,4,4,4,4,4)

    println(solution(testSurvey,testChoices))
}