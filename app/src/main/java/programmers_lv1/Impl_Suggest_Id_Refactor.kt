package programmers_lv1

private fun solution(new_id: String): String {
    return new_id.step1().step2().step3().step4().step5().step6().step7()
}

fun String.step1 () = this.lowercase()

fun String.step2 () = this.filter {
    listOf<Char>('.', '-', '_').contains(it) || ('a'..'z').contains(it) || ('0'..'9').contains(
        it
    )
}

fun String.step3 () : String {
    tailrec fun test(str: String): String {
        if (!str.contains("..")) return str
        return test(str.replace("..","."))
    }

    return test(this)
}

fun String.step4 () = this.removePrefix(".").removeSuffix(".")

fun String.step5 () = this.ifEmpty { "a" }

fun String.step6 () = (if (this.length > 15) this.take(15) else this).removeSuffix(".")

fun String.step7 () : String {
    tailrec fun minLength (str: String) : String {
        if (str.length > 2) return str
        return minLength(str + str.last())
    }

    return minLength(this)
}




fun main() {
    val testA = "...11...."

    println(solution(testA))
}