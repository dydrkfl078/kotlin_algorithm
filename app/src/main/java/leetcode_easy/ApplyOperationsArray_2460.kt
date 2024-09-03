package leetcode_easy

// 배열의 0을 뒤로 몰아넣는 작업과 다음 위치의 배열이 같을 경우 *2 하는 작업을 분리하는 제한사항.

class ApplyOperationsArray_2460 {
    fun applyOperations(nums: IntArray): IntArray {
        var zeroCount = 0
        val answer = mutableListOf<Int>()

        for (i in 0 until nums.size-1) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2
                nums[i+1] *= 0
            }
        }

        nums.forEach {
            if (it != 0) {
                answer.add(it)
            } else {
                zeroCount ++
            }
        }

        for (i in 1 .. zeroCount) {
            answer.add(0)
        }

        return answer.toIntArray()
    }
}

fun main() {
    val solution = ApplyOperationsArray_2460()
    println(solution.applyOperations(intArrayOf(1,2,2,4,5,0,3)).toList())
}