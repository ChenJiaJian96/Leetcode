/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
class TwoSumInputArrayIsSorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (firstIndex in 0 until numbers.size - 1) {
            for (secondIndex in firstIndex + 1 until numbers.size) {
                val total = numbers[firstIndex] + numbers[secondIndex]

                if (total == target) {
                    return intArrayOf(firstIndex + 1, secondIndex + 1)
                } else if (total > target) {
                    break
                }
            }
        }
        return intArrayOf(-1, -1)
    }
}