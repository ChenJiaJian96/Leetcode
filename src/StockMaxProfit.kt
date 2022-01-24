/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 股票最大收益
 */
class StockMaxProfit {
    fun maxProfit(prices: IntArray): Int {
        val maxPriceArray = IntArray(prices.size)
        maxPriceArray[0] = 0

        for (lastDay in 1..prices.lastIndex) {
            val currentProfit = prices[lastDay] - prices[lastDay - 1]
            val lastDayMaxProfit = maxPriceArray[lastDay - 1].coerceAtLeast(0)

            maxPriceArray[lastDay] = currentProfit + lastDayMaxProfit
        }
        return maxPriceArray.max() ?: 0
    }
}