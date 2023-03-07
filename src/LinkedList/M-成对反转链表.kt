package LinkedList

import bean.ListNode


class ReverseLinkedListThree {

    /**
     * https://mp.weixin.qq.com/s?__biz=MzIxNjc0ODExMA==&mid=2247486489&idx=1&sn=23b94f261ddc287c852df0452296cc92
     */
    fun swapPairsA(head: ListNode?): ListNode? {
        val dummy = ListNode(`val` = -1, next = head)

        var curNode: ListNode? = dummy
        // 循环退出条件，注意链表结点数单双的情况
        while (curNode?.next != null && curNode.next?.next != null) {
            val a = curNode.next // 成对前节点
            val b = a?.next // 成对后节点

            curNode.next = b // 步骤①
            a?.next = b?.next // 步骤①
            b?.next = a // 步骤②

            // dummy 指针前移
            curNode = a
        }

        return dummy.next
    }

    fun swapPairsB(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        val next = head.next
        head.next = swapPairsB(next?.next)
        next?.next = head
        return next
    }
}