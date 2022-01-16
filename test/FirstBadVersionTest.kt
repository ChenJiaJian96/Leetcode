import org.junit.Assert.*
import org.junit.Test

class FirstBadVersionTest {

    @Test
    fun testCase_1_1() {
        val helper = FirstBadVersion()
        helper.badVersion = 1
        print(helper.firstBadVersion(1))
    }

    @Test
    fun testCase_2_1() {
        val helper = FirstBadVersion()
        helper.badVersion = 1
        print(helper.firstBadVersion(2))
    }


    @Test
    fun testCase_5_4() {
        val helper = FirstBadVersion()
        helper.badVersion = 4
        print(helper.firstBadVersion(5))
    }

    @Test
    fun testSomeBigCase() {
        val helper = FirstBadVersion()
        helper.badVersion = 1702766719
        print(helper.firstBadVersion(2126753390))
    }
}