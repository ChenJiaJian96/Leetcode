/**
 * https://leetcode-cn.com/problems/search-insert-position/
 */
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return searchInsert(nums, 0, nums.size, target)
    }

    private fun searchInsert(nums: IntArray, leftPos: Int, rightPos: Int, target: Int): Int {
        // 结束条件 要么左边，要么右边
        if (leftPos + 1 == rightPos) {
            return if (nums[leftPos] >= target) leftPos else rightPos
        }

        val intervalPos = (leftPos + rightPos) / 2
        val intervalValue = nums[intervalPos]
        return when {
            intervalValue == target -> intervalPos
            intervalValue > target -> searchInsert(nums, leftPos, intervalPos, target)
            else -> searchInsert(nums, intervalPos, rightPos, target)
        }
    }
}