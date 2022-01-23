/**
 * https://leetcode-cn.com/problems/two-sum/
 */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (firstIndex in 0 until nums.size - 1) {
            val secondIndex = nums.indexOf(target - nums[firstIndex], firstIndex + 1, nums.size)
            if (secondIndex != -1) {
                return intArrayOf(firstIndex, secondIndex)
            }
        }
        return intArrayOf(-1, -1)
    }

    private fun IntArray.indexOf(target: Int, startPos: Int, endPos: Int) : Int {
        for (index in startPos until endPos) {
            if (get(index) == target) {
                return index
            }
        }
        return -1
    }
}