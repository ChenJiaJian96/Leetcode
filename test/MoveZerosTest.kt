import org.junit.Test
import kotlin.test.assertTrue

class MoveZerosTest {

    val helper = MoveZeros()

    @Test
    fun test_1() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        helper.moveZeroes(nums)

        assertTrue(intArrayOf(1,3,12,0,0).contentEquals(nums))
    }
}