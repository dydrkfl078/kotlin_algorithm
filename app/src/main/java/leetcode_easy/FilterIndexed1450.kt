package leetcode_easy

class FilterIndexed1450 {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        return startTime.filterIndexed { index, i ->
            (i..endTime[index]).contains(queryTime)
        }.size
    }
}

fun main() {
    FilterIndexed1450().busyStudent(intArrayOf(1,3,2,4), intArrayOf(4,3,5,8), 4)
}