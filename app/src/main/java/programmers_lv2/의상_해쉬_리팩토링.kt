package programmers_lv2

private fun solution(clothes: Array<Array<String>>): Int {
    val clothesMap = HashMap<String, Int>()

    // 의상 종류별로 개수 세기
    clothes.forEach {
        val type = it.last() // 종류
        clothesMap[type] = clothesMap.getOrDefault(type, 0) + 1
    }

    // 각 종류별로 아무것도 선택하지 않는 경우를 포함하여 경우의 수 계산 후 모두 곱하기
    var answer = 1
    clothesMap.values.forEach {
        answer *= (it + 1)
    }

    // 아무것도 선택하지 않는 경우 제외
    return answer - 1
}

fun main() {
    // 10, 33, 44 20 = 107
    val clothes = arrayOf(arrayOf("a","green"), arrayOf("b","green"), arrayOf("c","blue"), arrayOf("d","blue"),
        arrayOf("e","pink"),arrayOf("f","brown"),arrayOf("g","brown"),arrayOf("h","brown"),arrayOf("i","brown"),arrayOf("j","brown"),
    )

    // 9, 25, 36, 10 = 80
    val clothesB = arrayOf(arrayOf("a","green"), arrayOf("c","blue"), arrayOf("d","blue"),
        arrayOf("e","pink"),arrayOf("f","brown"),arrayOf("g","brown"),arrayOf("h","brown"),arrayOf("i","brown"),arrayOf("j","brown"),
    )

    println(solution(clothes))
}