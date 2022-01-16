import org.junit.Assert.assertEquals
import org.junit.Test

class SearchInsertPositionTest {
    private val helper = SearchInsertPosition()

    @Test
    fun test1() {
        val result = helper.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 5)
        assertEquals(2, result)
    }

    @Test
    fun test2() {
        val result = helper.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 2)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val result = helper.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 7)
        assertEquals(4, result)
    }

    @Test
    fun test4() {
        val result = helper.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 0)
        assertEquals(0, result)
    }

    @Test
    fun test5() {
        val result = helper.searchInsert(nums = intArrayOf(1), target = 0)
        assertEquals(0, result)
    }

    @Test
    fun test6() {
        val result = helper.searchInsert(nums = intArrayOf(1), target = 1)
        assertEquals(0, result)
    }

    @Test
    fun test7() {
        val result = helper.searchInsert(nums = intArrayOf(1), target = 2)
        assertEquals(1, result)
    }
}