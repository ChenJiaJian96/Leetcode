import org.junit.Test
import kotlin.test.assertTrue

class SquareOfASortedArrayTest {

    private val helper = SquareOfASortedArray()

    @Test
    fun test_1() {
        val input = intArrayOf(-4, -1, 0, 3, 10)
        assertTrue(intArrayOf(0, 1, 9, 16, 100).contentEquals(helper.sortedSquares(nums = input)))
    }

    @Test
    fun test_2() {
        val input = intArrayOf(-7, -3, 2, 3, 11)
        assertTrue(intArrayOf(4, 9, 9, 49, 121).contentEquals(helper.sortedSquares(nums = input)))
    }

    @Test
    fun test_3() {
        val input = intArrayOf(1)
        assertTrue(intArrayOf(1).contentEquals(helper.sortedSquares(nums = input)))
    }

    @Test
    fun test_4() {
        val input = intArrayOf(-1, 1)
        assertTrue(intArrayOf(1, 1).contentEquals(helper.sortedSquares(nums = input)))
    }
}