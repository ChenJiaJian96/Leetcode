import kotlin.math.max

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
class LongestSubString {

    // a b c a
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        val strLength = s.length

        var leftPos = 0
        var rightPos = 1
        var longestLength = 1
        while (rightPos < strLength) {
            val needCheckStr = s.substring(leftPos, rightPos)
            val nextCharIndexInCheckStr = needCheckStr.indexOf(s[rightPos]) // 当前字符串包含下一个字符串
            if (nextCharIndexInCheckStr != -1) {
                rightPos++

                leftPos += nextCharIndexInCheckStr + 1
            } else {
                rightPos++

                val curLength = rightPos - leftPos
                longestLength = max(longestLength, curLength)
            }
        }


        return longestLength
    }
}