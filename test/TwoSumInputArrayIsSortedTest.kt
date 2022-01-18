import org.junit.Test
import kotlin.test.assertTrue

class TwoSumInputArrayIsSortedTest {

    val helper = TwoSumInputArrayIsSorted()

    @Test
    fun test_1() {
//        输入：numbers = [2,7,11,15], target = 9
//        输出：[1,2]
        val result = helper.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertTrue(result.contentEquals(intArrayOf(1, 2)))
    }

    @Test
    fun test_2() {
//        输入：numbers = [2,3,4], target = 6
//        输出：[1,3]
        val result = helper.twoSum(intArrayOf(2, 3, 4), 6)
        assertTrue(result.contentEquals(intArrayOf(1, 3)))
    }

    @Test
    fun test_3() {
//        输入：numbers = [-1,0], target = -1
//        输出：[1,2]
        val result = helper.twoSum(intArrayOf(-1, 0), -1)
        assertTrue(result.contentEquals(intArrayOf(1, 2)))
    }
}