/**
 * https://leetcode-cn.com/problems/reverse-string/
 */
class ReverseString {

    fun reverseString(s: CharArray) {
        val lastIndex = s.lastIndex
        for (i in 0 until lastIndex / 2 + 1) {
            val leftVal = s[i]
            s[i] = s[lastIndex - i]
            s[lastIndex - i] = leftVal
        }
    }

}