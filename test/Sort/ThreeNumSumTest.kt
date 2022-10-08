import org.junit.Test
import kotlin.test.assertTrue

class ThreeNumSumTest {

    @Test
    fun testThreeNumSum() {
        val helper = ThreeNumSum()

//        val result1 = helper.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
//        assertTrue(result1.size == 2)
//
//        val result2 = helper.threeSum(intArrayOf(0, 1, 1))
//        assertTrue(result2.isEmpty())
//
//        val result3 = helper.threeSum(intArrayOf(0, 0, 0))
//        assertTrue(result3.size == 1)

        val result4 = helper.threeSum(intArrayOf(0, 0, 0, 0))
        assertTrue(result4.size == 1)
    }

    @Test
    fun testQuickSort_0() {
        val result = intArrayOf(0)

        result.sortQuickly()

        assertTrue { result.contentEquals(intArrayOf(0)) }
    }

    @Test
    fun testQuickSort_1() {
        val result = intArrayOf(2, 1, 3)

        result.sortQuickly()

        assertTrue { result.contentEquals(intArrayOf(1, 2, 3)) }
    }

    @Test
    fun testQuickSort_2() {
        val result = intArrayOf(2, 1, 1, 3, 3)

        result.sortQuickly()

        assertTrue { result.contentEquals(intArrayOf(1, 1, 2, 3, 3)) }
    }

    @Test
    fun testQuickSort_3() {
        val result = intArrayOf(-1, -1, -4)

        result.sortQuickly()

        assertTrue { result.contentEquals(intArrayOf(-4, -1, -1)) }
    }

}