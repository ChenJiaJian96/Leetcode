/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * 你返回所有和为 0 且不重复的三元组。
 *
 * https://leetcode.cn/problems/3sum/
 */
class ThreeNumSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val firstElementSet = mutableSetOf<Int>()
        val firstAndSecondElementSet = mutableSetOf<Pair<Int, Int>>()

        nums.sort()

        for (firstIndex in 0 until nums.size - 2) {
            if (nums[firstIndex] > 0) break
            if (firstElementSet.contains(nums[firstIndex])) continue

            for (secondIndex in firstIndex + 1 until nums.size - 1) {
                if (firstAndSecondElementSet.contains(nums[firstIndex] to nums[secondIndex])) continue

                for (thirdIndex in secondIndex + 1 until nums.size) {
                    val sum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]
                    if (sum > 0) break
                    if (sum == 0) {
                        result.add(listOf(nums[firstIndex], nums[secondIndex], nums[thirdIndex]))
                        firstElementSet.add(nums[firstIndex])
                        firstAndSecondElementSet.add(nums[firstIndex] to nums[secondIndex])

                        break
                    }
                }
            }
        }

        return result
    }
}

fun IntArray.sortQuickly() {
    this.sortQuickly(0, this.lastIndex)
}

fun IntArray.sortQuickly(startIndex: Int, endIndex: Int) {
    if (startIndex >= endIndex) return

    val pivot = this[startIndex]

    var leftHandle = startIndex
    var rightHandle = endIndex
    while (leftHandle < rightHandle) {
        while (leftHandle < rightHandle && this[rightHandle] >= pivot) rightHandle--
        while (leftHandle < rightHandle && this[leftHandle] <= pivot) leftHandle++

        if (leftHandle < rightHandle) {
            swapVal(leftHandle, rightHandle)
        }
    }

    swapVal(startIndex, leftHandle)

    sortQuickly(startIndex, rightHandle - 1)
    sortQuickly(rightHandle + 1, endIndex)

}

private fun IntArray.swapVal(posA: Int, posB: Int) {
    val temp = this[posA]
    this[posA] = this[posB]
    this[posB] = temp
}

