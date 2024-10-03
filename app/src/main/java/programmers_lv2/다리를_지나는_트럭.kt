package programmers_lv2

class 다리를_지나는_트럭 {
    fun solution (bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val waitingTruck = truck_weights.toMutableList()

        val deque = ArrayDeque<Int>(List(bridge_length) {0})

        while (waitingTruck.isNotEmpty()) {

            deque.removeFirst()

            if (deque.sum() + waitingTruck.first() <= weight) {
                deque.addLast(waitingTruck.first())
                waitingTruck.removeFirst()
            } else {
                deque.addLast(0)
            }

            answer++
        }

        return answer+bridge_length
    }
}

fun main() {
    val mySolution = 다리를_지나는_트럭()

    println(mySolution.solution(2,10, intArrayOf(7,4,5,6)))
}