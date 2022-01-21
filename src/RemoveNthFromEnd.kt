import bean.ListNode

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
class RemoveNthFromEnd {

    /**
     * 思路：快慢指针 快指针比慢指针走快[n]步
     * 异常情况：删除头指针，则直接返回 head.next
     */
    fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {

        var slowNode: ListNode? = head
        var fastNode: ListNode? = head
        var calLength = 1

        repeat(n) {
            if (fastNode?.next != null) {
                fastNode = fastNode?.next
                calLength++
            }
        }

        while (fastNode?.next != null) {
            slowNode = slowNode?.next
            fastNode = fastNode?.next

            calLength++
        }

        return if (calLength == n) { // 删除的位置等于链表长度，说明删除头指针
            head.next
        } else {
            slowNode?.next = slowNode?.next?.next
            head
        }

    }
}