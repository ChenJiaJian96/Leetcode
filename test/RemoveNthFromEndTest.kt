import bean.ListNode
import org.junit.Assert.*
import org.junit.Test

class RemoveNthFromEndTest {

    private val helper = RemoveNthFromEnd()

    @Test
    fun test_1() {
//        输入：head = [1,2,3,4,5], n = 2
//        输出：[1,2,3,5]
        val input = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 2).also { secondNode ->
                secondNode.next = ListNode(`val` = 3).also { thirdNode ->
                    thirdNode.next = ListNode(4).also { forthNode ->
                        forthNode.next = ListNode(`val` = 5)
                    }
                }
            }
        }
        val result = helper.removeNthFromEnd(input, n = 2)?.valueList() ?: arrayListOf()
        assertTrue(result.toIntArray().contentEquals(intArrayOf(1,2,3,5)))
    }

    @Test
    fun test_2() {
//        输入：head = [1], n = 1
//        输出：[]
        val input = ListNode(`val` = 1)
        val result = helper.removeNthFromEnd(input, n = 1)?.valueList() ?: arrayListOf()
        assertTrue(result.toIntArray().contentEquals(intArrayOf()))
    }

    @Test
    fun test_3() {
//    输入：head = [1,2], n = 1
//    输出：[1]
        val input = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 2)
        }
        val result = helper.removeNthFromEnd(input, n = 1)?.valueList() ?: arrayListOf()
        assertTrue(result.toIntArray().contentEquals(intArrayOf(1)))
    }

    @Test
    fun test_4() {
//    输入：head = [1,2], n = 2
//    输出：[2]
        val input = ListNode(`val` = 1).also { firstNode ->
            firstNode.next = ListNode(`val` = 2)
        }
        val result = helper.removeNthFromEnd(input, n = 2)?.valueList() ?: arrayListOf()
        assertTrue(result.toIntArray().contentEquals(intArrayOf(2)))
    }
}