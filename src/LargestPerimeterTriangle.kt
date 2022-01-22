import kotlin.math.abs

/**
 * https://leetcode-cn.com/problems/largest-perimeter-triangle/
 */
class LargestPerimeterTriangle {
    /**
     * 思路（套路）
     * 1.排序，从大到小
     * 2.相邻查找即可 滑动窗口 size = 3
     */
    fun largestPerimeter(nums: IntArray): Int {
        nums.sortDescending()

        var startPos = 0
        var endPos = 2
        while (endPos <= nums.lastIndex) {
            val first = nums[startPos]
            val second = nums[startPos + 1]
            val third = nums[endPos]
            if (isTriangle(first, second, third)) {
                return first + second + third
            }
            startPos++
            endPos++
        }
        return 0
    }

    private fun isTriangle(first: Int, second: Int, third: Int): Boolean {
        return first + second > third && abs(first - second) < third
    }
}