package programmers_lv1

private fun solution(a: Int, b: Int, n: Int): Int {

    tailrec fun takeCola(input: Int, inventory: Int, remains: Int): Int {
        if (input == 0) return inventory-n
        return takeCola((input+remains)/a*b,inventory+input,(input+remains)%a)
    }

    return takeCola(n,0,0)
}

fun main() {
    val testA = 3
    val testB = 1
    val testC = 20

    solution(testA,testB,testC)
}