import bean.ListNode

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class ReverseLinkedListTwo {

    /**
     * 解法一思路：穿针引线
     * 结合假头结点
     * 确定反转的区间，切断链接，反转之后再重新建立链接
     */

    /**
     * 解法二思路：头插法
     * 1.通用思路：使用假的头结点，避免分类讨论
     * 2.从 [left] 到 [right] 向后遍历，每次都将结点放到起初结点的前面
     */
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        // 设置假的头结点
        val dummyNode = ListNode(`val` = -1, next = head)
        var pre: ListNode? = dummyNode
        // 移动到起初结点
        for (i in 0 until left - 1) {
            pre = pre?.next
        }
        val cur = pre?.next
        var next: ListNode?
        for (i in 0 until right - left) {
            next = cur?.next
            cur?.next = next?.next
            next?.next = pre?.next
            pre?.next = next
        }

        // 最终返回
        return dummyNode.next
    }
}