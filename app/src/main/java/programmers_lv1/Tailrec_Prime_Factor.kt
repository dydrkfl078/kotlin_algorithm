package programmers_lv1

private fun solution(nums: IntArray): Int {
    var answer = 0
    var nC3 = mutableSetOf<List<Int>>()

    nums.mapIndexed { index, firstNum ->
        nums.filterNot { firstIt -> firstIt == firstNum }
            .mapIndexed { index, secondNum ->
                nums.filterNot { secondIt -> secondIt == firstNum || secondIt == secondNum }
                    .mapIndexed { index, thridNum ->
                        nC3.add(nums.filter { it == firstNum || it == secondNum || it == thridNum })
                    }
        }
    }

    println(nC3)
    nC3.forEach {
        if (!primeFactor(it.sum(),2)) {
            println(it.sum())
            answer ++
        }
    }
    return answer
}

tailrec fun primeFactor(n: Int, x: Int): Boolean {
    if ( n % x == 0) return true // n은 소수가 아니다.
    else if ( x == n - 1 ) return false // n은 소수다
    return primeFactor(n,x+1)
}


fun main() {
//    val testA = intArrayOf(1, 2, 7, 6, 4)
    val testB = intArrayOf(1,2,7,6,4)

//    println(solution(testA))
    println(solution(testB))

}