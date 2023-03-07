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
     * 思路：https://mp.weixin.qq.com/s?__biz=MzIxNjc0ODExMA==&mid=2247486049&idx=1&sn=826873b49f40cce800cc08f3e98ce32f
     */
    fun reverseList(head: ListNode?): ListNode? {
        var preNode : ListNode? = null
        var curNode = head
        var nextNode: ListNode?

        while (curNode != null) {
            // nextNode <- curNode.next <- preNode <- curNode <- nextNode
            nextNode = curNode.next
            curNode.next = preNode
            preNode = curNode
            curNode = nextNode
        }
        return preNode
    }

    fun reverse(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }

        val newHead = reverse(head.next)
        head.next?.next = head
        head.next = null
        return newHead
    }
}