/**
 * https://leetcode-cn.com/problems/move-zeroes/
 */
class MoveZeros {
    /**
     * 思路：设置一个index，表示非0数的个数
     * 循环遍历数组，如果不是0，将非0值移动到第 index 位置,然后index + 1
     * 遍历结束之后，index值表示为非0的个数，再次遍历，从index位置后的位置此时都应该为 0
     */
    fun moveZeroes(nums: IntArray) {
        var nonZeroNum = 0
        for (element in nums) {
            if (element != 0) {
                nums[nonZeroNum] = element
                nonZeroNum++
            }
        }

        for (i in nonZeroNum until nums.size) {
            nums[i] = 0
        }

    }
}