
class NumberOfEquivalentDominoPairs_1128 {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val countMap = HashMap<Int, Int>()

        var answer = 0
        for (domino in dominoes) {
            val temp = domino.min() * 100 + domino.max()
            var duplicateCount = countMap.getOrDefault(temp,0)
            answer += duplicateCount
            countMap[temp] = duplicateCount + 1
        }

        return answer
    }

    fun mainTest(){
        val dominoes = arrayOf(intArrayOf(1,2), intArrayOf(1,2), intArrayOf(2,1), intArrayOf(3,4), intArrayOf(5,6))
        numEquivDominoPairs(dominoes)
    }

}

