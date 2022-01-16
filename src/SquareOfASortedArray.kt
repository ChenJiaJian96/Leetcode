import kotlin.math.abs

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
class SquareOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {

        var startPos = 0
        var endPos = nums.lastIndex
        val result = arrayListOf<Int>()

        while (startPos != endPos) {
            val leftVal = abs(nums[startPos])
            val rightVal = abs(nums[endPos])
            if (leftVal < rightVal) {
                result.add(0, rightVal * rightVal)
                endPos--
            } else {
                result.add(0, leftVal * leftVal)
                startPos++
            }
        }
        val lastVal = abs(nums[startPos])
        result.add(0, lastVal * lastVal)

        return IntArray(result.size) {
            result[it]
        }
    }
}