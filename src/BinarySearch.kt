/**
 * https://leetcode-cn.com/problems/binary-search
 */
class Solution {

    companion object {
        const val NOT_EXIST_CASE = -1
    }

    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, 0, nums.size - 1, target)
    }

    /**
     * 二分查找
     * @param nums 传入 Int 数组
     * @param startPos 起始查找位置
     * @param endPos 终点查找位置
     * @param target 查找目标
     */
    private fun binarySearch(nums: IntArray, startPos: Int, endPos: Int, target: Int): Int {
        if (nums.isEmpty()) { // size == 0
            return NOT_EXIST_CASE
        }
        if (endPos - startPos == 0) { // size == 1
            return if (nums[startPos] == target) startPos else NOT_EXIST_CASE
        }
        if (endPos - startPos == 1) {
            return when (target) {
                nums[startPos] -> startPos
                nums[endPos] -> endPos
                else -> NOT_EXIST_CASE
            }
        }

        val intervalIndex = startPos + (endPos - startPos) / 2
        val intervalNum = nums[intervalIndex]
        val leftRange = Pair(startPos, intervalIndex - 1)
        val rightRange = Pair(intervalIndex + 1, endPos)

        return when {
            intervalNum == target -> intervalIndex
            target < intervalNum -> binarySearch(nums, leftRange.first, leftRange.second, target)
            else -> binarySearch(nums, rightRange.first, rightRange.second, target)
        }
    }
}