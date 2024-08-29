
class TwoSum_1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        tailrec fun findTarget(base: Int, temp: Int) : IntArray {
            var twoSum = nums[base] + nums[temp]
            if (twoSum == target) return intArrayOf(base,temp)
            if (temp == nums.size-1) return findTarget(base+1, base+2)

            return findTarget(base , temp + 1)
        }

        return findTarget(0, 1)
    }

    fun main(){
        twoSum(intArrayOf(3,2,4),9) // shouldBe intArrayOf(0,1)
    }
}