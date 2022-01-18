import org.junit.Assert.assertTrue
import org.junit.Test

class CQueueTest {

    @Test
    fun test_1() {
        val helper = CQueue()

        val op = arrayListOf("CQueue", "appendTail", "deleteHead", "deleteHead")
        val nums = intArrayOf(-1, 3, -1, -1)
        val result = helper.operate(op, nums)
        print(result)
        assertTrue(arrayListOf("null", "null", "3", "-1") == result)
    }

    @Test
    fun test_2() {
        val helper = CQueue()

        val op = arrayListOf("CQueue", "deleteHead", "appendTail", "appendTail", "deleteHead", "deleteHead")
        val nums = intArrayOf(-1, -1, 5, 2, -1, -1)
        val result = helper.operate(op, nums)
        print(result)
        assertTrue(arrayListOf("null", "-1", "null", "null", "5", "2") == result)
    }
}