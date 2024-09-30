package leetcode_medium

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val answer = mutableListOf<List<Int>>()

    fun dfs(sum: Int, index: Int, result: MutableList<Int>){
        when {
            (sum > target) -> { return }
            (sum == target) -> {
                answer.add(result.toList())
                return
            }
        }

        (index until candidates.size).forEach {
            result.add(candidates[it])
            dfs(sum+ candidates[it], it, result)
            result.removeLast()
        }
    }

    dfs(0,0,mutableListOf<Int>())

    return answer
}

fun main() {
    combinationSum(intArrayOf(1,2,3,4,5),5)
}