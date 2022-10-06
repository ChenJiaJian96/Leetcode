import bean.ListNode
import org.junit.Assert.assertTrue
import org.junit.Test

class ReverseLinkedListTestTwo {

    private val helper = ReverseLinkedListTwo()

    @Test
    fun test_1() {
        val head = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 2).also { secondNode ->
                secondNode.next = ListNode(`val` = 3).also { thirdNode ->
                    thirdNode.next = ListNode(`val` = 4)
                }
            }
        }

        val result = helper.reverseBetween(head, 2, 3)
        assertTrue(
            intArrayOf(1, 3, 2, 4).contentEquals(
                result?.valueList()?.toIntArray() ?: intArrayOf(0)
            )
        )
    }

}