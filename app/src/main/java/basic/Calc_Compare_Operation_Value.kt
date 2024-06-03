package basic

private fun solution (a : Int, b: Int): Int {
    var answer = 0

    var sum = ("$a" + "$b").toInt()
    var mul = 2 * ("$a" + "$b").toInt()
    if ( answer < sum) {
        answer = sum
    }

    if ( answer < mul) {
        answer = mul
    }
    return answer
}

fun main (){
    var testA = 2
    var testB = 91
    solution(testA,testB)
}