import org.junit.Assert.*
import org.junit.Test

class PickCoinsTest {

    private val helper = PickCoins()

    @Test
    fun test_1() {
        // 我们有面值为1元、3元和5元的硬币若干枚，如何用最少的硬币凑够11元
        val minNum = helper.getMinCoinNum(
            coins = intArrayOf(1, 3, 5),
            total = 11
        )
        assertEquals(3, minNum)
    }
}