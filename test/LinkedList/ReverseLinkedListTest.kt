import bean.ListNode
import bean.optIntArray
import org.junit.Assert.assertTrue
import org.junit.Test

class ReverseLinkedListTest {

    private val helper = ReverseLinkedList()

    @Test
    fun test_1() {
        val head = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 3).also { secondNode ->
                secondNode.next = ListNode(`val` = 2)
            }
        }

        val result1 = helper.reversePrint(head)
        val result2 = helper.reverseList(head)
        val result3 = helper.reverse(head)
        assertTrue(intArrayOf(2, 3, 1).contentEquals(result1))
        assertTrue(intArrayOf(2, 3, 1).contentEquals(result2.optIntArray()))
        assertTrue(intArrayOf(2, 3, 1).contentEquals(result3.optIntArray()))
    }
}