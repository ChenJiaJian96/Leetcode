import org.junit.Assert
import org.junit.Test

class BinarySearchTest {

    private val solution = BinarySearch()

    /**
     * Input: nums = [], target = 0
     * Output: -1
     */
    @Test
    fun testEmptyArray() {
        val input = intArrayOf()
        val target = 0
        val output = solution.search(input, target)

        Assert.assertEquals(BinarySearch.NOT_EXIST_CASE, output)
    }

    /**
     * Input: nums = [1], target = 1
     * Output: 0
     */
    @Test
    fun testOneLengthArray_exist() {
        val input = intArrayOf(1)
        val target = 1
        val output = solution.search(input, target)

        Assert.assertEquals(0, output)
    }

    /**
     * Input: nums = [1], target = 2
     * Output: -1
     */
    @Test
    fun testOneLengthArray_notExist() {
        val input = intArrayOf(1)
        val target = 2
        val output = solution.search(input, target)

        Assert.assertEquals(BinarySearch.NOT_EXIST_CASE, output)
    }

    /**
     * Input: nums = [2, 5], target = 0
     * Output: -1
     */
    @Test
    fun testTwoLengthArray_notExist() {
        val input = intArrayOf(2, 5)
        val target = 0
        val output = solution.search(input, target)

        Assert.assertEquals(BinarySearch.NOT_EXIST_CASE, output)
    }

    /**
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     */
    @Test
    fun testExistsCase() {
        val input = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val output = solution.search(input, target)

        Assert.assertEquals(4, output)
    }

    /**
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     */
    @Test
    fun testNotExistsCase() {
        val input = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 2
        val output = solution.search(input, target)

        Assert.assertEquals(BinarySearch.NOT_EXIST_CASE, output)
    }
}