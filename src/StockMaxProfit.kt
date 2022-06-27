class StockMaxProfit {
    /**
     * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
     * 股票最大收益
     */
    fun maxProfit(prices: IntArray): Int {
        val maxPriceArray = IntArray(prices.size)
        maxPriceArray[0] = 0

        for (lastDay in 1..prices.lastIndex) {
            val currentProfit = prices[lastDay] - prices[lastDay - 1]
            val lastDayMaxProfit = maxPriceArray[lastDay - 1].coerceAtLeast(0)

            maxPriceArray[lastDay] = currentProfit + lastDayMaxProfit
        }
        return maxPriceArray.maxOrNull() ?: 0
    }

    /**
     * https://leetcode-cn.com/problems/maximum-subarray/
     * 最大子数组和
     */
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        for (index in 1..nums.lastIndex) {
            val lastMaxValue = nums[index - 1]
            var currentNum = nums[index]
            if (lastMaxValue > 0) {
                currentNum += lastMaxValue
                nums[index] = currentNum
            }
            if (currentNum > max) {
                max = currentNum
            }
        }
        return max
    }
}