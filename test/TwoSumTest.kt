import org.junit.Assert.assertTrue
import org.junit.Test

class TwoSumTest {
    private val helper = TwoSum()

    @Test
    fun test_1() {
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
        val result = helper.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }


    @Test
    fun test_2() {
        // 输入：nums = [3,2,4], target = 6
        // 输出：[1,2]
        val result = helper.twoSum(intArrayOf(3, 2, 4), 6)
        assertTrue(intArrayOf(1, 2).contentEquals(result))
    }

    @Test
    fun test_3() {
//        输入：nums = [3,3], target = 6
//        输出：[0,1]
        val result = helper.twoSum(intArrayOf(3, 3), 6)
        assertTrue(intArrayOf(0, 1).contentEquals(result))
    }
}