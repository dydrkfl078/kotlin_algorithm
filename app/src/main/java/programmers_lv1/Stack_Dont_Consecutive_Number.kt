package programmers_lv1

import java.util.Stack

private fun solution (arr : IntArray): IntArray {
    var answer = intArrayOf()

    var prevNum : Stack<Int> = Stack()

    arr.forEach {
        if (prevNum.size == 0) {
            prevNum.push(it)
        } else if (prevNum.peek() != it){
            prevNum.push(it)
        }
    }

    println(prevNum)
    return answer
}

fun main (){
    var testA = intArrayOf(1,1,2,2,2,5,5,4,1,4,3,3,2,2)
    solution(testA)
}