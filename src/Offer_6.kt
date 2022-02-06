import bean.ListNode

class ReverseLinkedList {
    /**
     * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
     * 从尾到头打印链表
     *
     * 思路：遍历计算总长度，随后反向填入
     */
    fun reversePrint(head: ListNode?): IntArray {
        var node = head
        var count = 0
        while (node != null) {
            count++
            node = node.next
        }

        val nums = IntArray(count)
        node = head
        for (i in count - 1 downTo 0) {
            nums[i] = node?.`val` ?: 0
            node = node?.next
        }
        return nums
    }

    /**
     * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
     * 反转链表
     *
     * 思路：
     */
    fun reverseList(head: ListNode?): ListNode? {
        var preNode: ListNode? = null
        var curNode: ListNode? = head
        var nextNode: ListNode?

        while (curNode != null) {
            nextNode = curNode.next
            curNode.next = preNode
            preNode = curNode
            curNode = nextNode
        }

        return preNode
    }
}