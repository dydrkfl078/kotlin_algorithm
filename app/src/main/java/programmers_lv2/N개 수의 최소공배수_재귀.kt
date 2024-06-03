package programmers_lv2

private fun solution(arr: IntArray): Int {

    return lcm(arr)
}

tailrec fun gcd(n: Int, m: Int, result: Int = intArrayOf(n, m).minOrNull()?:1 ):Int{
    if (n % result == 0 && m % result == 0) return result
    return gcd(n, m, result - 1)
}

tailrec fun lcm (arr: IntArray):Int{
    if (arr.size == 2) return arr.fold(1){acc, i -> acc * i } / gcd(arr[0],arr[1])
    var temp = arr.dropLast(2).toIntArray()
    temp += lcm(arr.takeLast(2).toIntArray())
    return lcm(temp)
}

fun main() {
    val arr = intArrayOf(1,2,3)

    println(solution(arr))
}
