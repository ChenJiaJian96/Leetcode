import org.junit.Test
import kotlin.test.assertTrue

class ReverseStringTest {

    private val helper = ReverseString()

    @Test
    fun test_1() {
        val testArray = charArrayOf('A')
        helper.reverseString(testArray)

        assertTrue(testArray.contentEquals(charArrayOf('A')))
    }

    @Test
    fun test_2() {
        val testArray = charArrayOf('A', 'B')
        helper.reverseString(testArray)

        assertTrue(testArray.contentEquals(charArrayOf('B', 'A')))
    }

    @Test
    fun test_3() {
        val testArray = charArrayOf('A', 'B', 'C')
        helper.reverseString(testArray)

        assertTrue(testArray.contentEquals(charArrayOf('C', 'B', 'A')))
    }

    @Test
    fun test_4() {
        val testArray = charArrayOf('A', 'B', 'C', 'D')
        helper.reverseString(testArray)

        assertTrue(testArray.contentEquals(charArrayOf('D', 'C', 'B', 'A')))
    }

    @Test
    fun test_5() {
        val testArray = charArrayOf('h','e','l','l','o')
        helper.reverseString(testArray)

        assertTrue(testArray.contentEquals(charArrayOf('o','l','l','e','h')))
    }


}