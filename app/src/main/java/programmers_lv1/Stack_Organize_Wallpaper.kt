package programmers_lv1

import java.util.Stack

private fun solution(wallpaper: Array<String>): IntArray {
    var lux = Stack<Int>()
    var luy = Stack<Int>()
    var ldx = Stack<Int>()
    var ldy = Stack<Int>()

    wallpaper.forEachIndexed { index, s ->
        var firstFileInfo = s.indexOf("#")
        var lastFileInfo = s.lastIndexOf("#") + 1 // 최대값을 덮어야하기 때문에 + 1

        if (firstFileInfo != -1){
            // lux, ldx로 좌우 크기 설정.
            lux.getMinOrMax(true,firstFileInfo)
            ldx.getMinOrMax(false,lastFileInfo)

            // 덮으려는 높이 시작점
            if (luy.isEmpty()) {
                luy.push(index)
            }

            // 덮으려는 높이 종료점
            if (ldy.isEmpty()) {
                ldy.push(index + 1)
            } else if (ldy.peek() < index + 1){
                ldy.push(index + 1)
            }
        }
    }
    println(" 결과는 : ${luy.peek()},${lux.peek()},${ldy.peek()},${ldx.peek()}")

    return intArrayOf(luy.peek(),lux.peek(),ldy.peek(),ldx.peek())
}

fun Stack<Int>.getMinOrMax ( isMin : Boolean, num : Int) {
    if (this.isNotEmpty()) {
        if (isMin && this.peek() > num) {
            this.push(num)
        } else if ( !isMin && this.peek() < num) {
            this.push(num)
        }
    } else {
        this.push(num)
    }
}

fun main() {
    val testA = arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....")
    val testB = arrayOf(".#...", "..#..", "...#.")
    val testC = arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#....")

//    println(solution(testA).toList())
    println(solution(testC).toList())
//    println(solution(testB))
}