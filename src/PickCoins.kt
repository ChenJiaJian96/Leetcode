/**
 * 动态规划：挑硬币问题
 *
 * 如：如果我们有面值为1元、3元和5元的硬币若干枚，如何用最少的硬币凑够11元？
 */
class PickCoins {
    fun getMinCoinNum(coins: IntArray, total: Int) : Int {
        // minCoins 表示每个总数所需的最少硬币个数
        val minCoins = IntArray(total + 1)
        minCoins[0] = 0

        for (target in 1..total) {
            // 要找最少的，初始化值为最大值
            minCoins[target] = Int.MAX_VALUE
            // 开始
            for (coinIndex in 0 until coins.size) {
                // 挑一个硬币
                val coin = coins[coinIndex]
                // 条件判断
                // 1.首先这枚硬币一定是小于目标值的，不然就没有意义了；
                // 2.动态规划：看下选择这枚硬币是否更优解：指的是减去这枚硬币的数额的数量 + 1 < 当前 target 的选择
                if (coin <= target && minCoins[target - coin] + 1 < minCoins[target]) {
                    // 如果是更优解的话，那么当前target所需的数量就是上面提到的 -> [减去这枚硬币的数额的数量 + 1]
                    minCoins[target] = minCoins[target - coin] + 1
                    // 如果最后还是 Int.MAX_VALUE 说明就没法组成 target 了
                }
            }
        }

        return minCoins[total]
    }
}