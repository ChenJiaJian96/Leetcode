import org.junit.Assert.assertEquals
import org.junit.Test

class StockMaxProfitTest {

    private val helper = StockMaxProfit()

    @Test
    fun test_1() {
//        输入：[7,1,5,3,6,4]
//        输出：5
        val result = helper.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(5, result)
    }

    @Test
    fun test_2() {
//        输入：[7,6,4,3,1]
//        输出：0
        val result = helper.maxProfit(intArrayOf(7, 6, 4, 3, 1))
        assertEquals(0, result)
    }
}