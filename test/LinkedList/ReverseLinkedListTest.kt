import bean.ListNode
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

        val result = helper.reversePrint(head)
        assertTrue(intArrayOf(2, 3, 1).contentEquals(result))
    }

    @Test
    fun test_reverse_list_node() {
        val head = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 3).also { secondNode ->
                secondNode.next = ListNode(`val` = 2)
            }
        }

        val resultHead = helper.reverseList(head)
        assertTrue(
            intArrayOf(2, 3, 1).contentEquals(
                resultHead?.valueList()?.toIntArray() ?: intArrayOf(0)
            )
        )
    }
}