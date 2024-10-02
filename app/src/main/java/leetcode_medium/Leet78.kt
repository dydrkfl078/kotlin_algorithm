package leetcode_medium

class Leet78 {
    fun subsets(nums: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()

        fun dfs(index:Int, result:MutableList<Int>){
            answer.add(result.toList())
            (index until nums.size).forEach {
                result.add(nums[it])
                dfs(it+1,result)
                result.removeLast()
            }
        }
        dfs(0, mutableListOf())
        return answer
    }
}

fun main() {
    val solution = Leet78()
    println(solution.subsets(intArrayOf(4,5,6,7)))
}