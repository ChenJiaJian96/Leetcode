/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 从尾到头打印链表
 */
class ReverseLinkedList {
    /**
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

    data class ListNode(val `val`: Int) {
        var next: ListNode? = null
    }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */