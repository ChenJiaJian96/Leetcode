import org.junit.Assert.assertTrue
import org.junit.Test

class RotateArrayTest {

    private val helper = RotateArray()

    @Test
    fun test_1() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        helper.rotate(nums = input, k = 3)
        assertTrue(intArrayOf(5, 6, 7, 1, 2, 3, 4).contentEquals(input))
    }

    @Test
    fun test_2() {
        val input = intArrayOf(-1, -100, 3, 99)
        helper.rotate(nums = input, k = 2)
        assertTrue(intArrayOf(3, 99, -1, -100).contentEquals(input))
    }

    @Test
    fun test_3() {
        val input = intArrayOf(1)
        helper.rotate(nums = input, k = 1)
        assertTrue(intArrayOf(1).contentEquals(input))
    }

    @Test
    fun test_4() {
        val input = intArrayOf(1, 2)
        helper.rotate(nums = input, k = 1)
        assertTrue(intArrayOf(2, 1).contentEquals(input))
    }
}