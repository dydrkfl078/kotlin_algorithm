package programmers_lv1

private fun solution(left: Int, right: Int): Int {

    tailrec fun findDividors(n: Int, div: Int, count: Int): Int {
        var counts = count
        if (n % div == 0) counts ++
        if (div == n) return counts
        return findDividors(n, div + 1, counts)
    }

    return (left..right).fold(0){ acc, i -> if (findDividors(i, 1, 0) % 2 == 0) acc + i else acc - i  }
}

fun main() {
    val left = 13
    val right = 17

    println(solution(left,right))
}