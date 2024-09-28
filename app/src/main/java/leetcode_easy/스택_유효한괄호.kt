package leetcode_easy

import java.util.concurrent.ConcurrentLinkedDeque

class 스택_유효한괄호 {

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.

    fun validation(s: String) : Boolean {

        val table = hashMapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{',
        )

        val stack = ConcurrentLinkedDeque<Char>()

        for (c in s) {

            if (!table.containsKey(c)) {
                stack.push(c)
            } else if (stack.isEmpty() || table[c] != stack.pop()) {
                return false
            }
        }

        return stack.size == 0
    }
}