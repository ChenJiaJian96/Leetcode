/**
 * https://leetcode-cn.com/problems/rotate-array/
 */
class RotateArray {

    /**
     * 思路：就是计算有多少个数字从后面放到前面即可。
     * 分界线前后分别翻转，最后整体翻转
     * 翻转函数可以在 reverse 的基础上进行改造
     */
    fun rotate(nums: IntArray, k: Int) {
        val needRotateNum = k % nums.size

        nums.reverse(0, nums.lastIndex - needRotateNum)
        nums.reverse(nums.lastIndex - needRotateNum + 1, nums.lastIndex)
        nums.reverse(0, nums.lastIndex)
    }

    private fun IntArray.reverse(startPos: Int, endPos: Int) {
        val totalSize = endPos - startPos + 1
        val midPoint = startPos + (totalSize / 2) - 1
        if (midPoint < 0) return
        var reverseIndex = endPos
        for (index in startPos..midPoint) {
            val tmp = this[index]
            this[index] = this[reverseIndex]
            this[reverseIndex] = tmp
            reverseIndex--
        }
    }

}