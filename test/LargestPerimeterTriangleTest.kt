import org.junit.Assert.assertEquals
import org.junit.Test

class LargestPerimeterTriangleTest {
    private val helper = LargestPerimeterTriangle()

    @Test
    fun test_1() {
//        输入：[2,1,2]
//        输出：5
        val result = helper.largestPerimeter(intArrayOf(2, 1, 2))
        assertEquals(5, result)
    }

    @Test
    fun test_2() {
//        输入：[1,2,1]
//        输出：0
        val result = helper.largestPerimeter(intArrayOf(1, 2, 1))
        assertEquals(0, result)
    }

    @Test
    fun test_3() {
//        输入：[3,2,3,4]
//        输出：10
        val result = helper.largestPerimeter(intArrayOf(3, 2, 3, 4))
        assertEquals(10, result)
    }

    @Test
    fun test_4() {
//        输入：[3,6,2,3]
//        输出：8
        val result = helper.largestPerimeter(intArrayOf(3, 6, 2, 3))
        assertEquals(8, result)
    }
}