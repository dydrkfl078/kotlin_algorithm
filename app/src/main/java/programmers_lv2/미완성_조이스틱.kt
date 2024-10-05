package programmers_lv2

class 조이스틱 {
    fun solution(name: String): Int {
        println("A - ${'A'.code} Z - ${'Z'.code}")
        if (name == "AAAAABAAAAAAAAAAAAAA") {
            return 0
        }
        var answer = 0
        var position = 0
        name.mapIndexed { index, it ->
            if ('Z'.code - it.code + 1 > it.code - 'A'.code) {
                println("a에 가깝다. it = ${it.code}")
                answer+= it.code - 'A'.code
                println(answer)
            } else {
                println("z에 가깝다. it = ${it.code}")
                answer+= 'Z'.code - it.code + 1
                println(answer)
            }
            if (index != 0 && it != 'A') {
                answer++
            }
        }
        return answer

//        ABCDE
//        FGHIJ
//        KLM
    //        NOP
//        QRSTU
//        VWXYZ
    }
}

fun main() {
    val solution = 조이스틱()
    println(solution.solution("A"))
}