/**
 * https://leetcode-cn.com/problems/first-bad-version/
 */
class FirstBadVersion : VersionControl() {

    override fun firstBadVersion(n: Int): Int {
        if (isBadVersion(1)) return 1

        return findBadVersion(biggestGoodVersion = 1, smallestBadVersion = n.toLong()).toInt()
    }

    private fun findBadVersion(biggestGoodVersion: Long, smallestBadVersion: Long): Long {
        // 夹逼法结束条件
        if (biggestGoodVersion == smallestBadVersion) return biggestGoodVersion // 两者相同，必然为 bad
        if (biggestGoodVersion == smallestBadVersion - 1) return smallestBadVersion

        // 逼近
        val midVersion = (biggestGoodVersion + smallestBadVersion) / 2
        val midResult = isBadVersion(midVersion.toInt())
        return if (midResult) {
            findBadVersion(biggestGoodVersion, midVersion)
        } else {
            findBadVersion(midVersion, smallestBadVersion)
        }
    }
}

abstract class VersionControl {

    var badVersion: Int = -1

    abstract fun firstBadVersion(n: Int): Int

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }
}