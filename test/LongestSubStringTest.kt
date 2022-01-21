import org.junit.Assert.*
import org.junit.Test

class LongestSubStringTest {
    private val helper = LongestSubString()

    @Test
    fun test_1() {
//        输入: s = "abcabcbb"
//        输出: 3
        val result = helper.lengthOfLongestSubstring("abcabcbb")
        assertEquals(3, result)
    }

    @Test
    fun test_2() {
//        输入: s = "bbbbb"
//        输出: 1
        val result = helper.lengthOfLongestSubstring("bbbbb")
        assertEquals(1, result)
    }

    @Test
    fun test_3() {
//        输入: s = "pwwkew"
//        输出: 3
        val result = helper.lengthOfLongestSubstring("pwwkew")
        assertEquals(3, result)
    }

    @Test
    fun test_4() {
//        输入: s = ""
//        输出: 0
        val result = helper.lengthOfLongestSubstring("")
        assertEquals(0, result)
    }

    @Test
    fun test_5() {
//        输入: s = "aab"
//        输出: 2
        val result = helper.lengthOfLongestSubstring("aab")
        assertEquals(2, result)
    }
}