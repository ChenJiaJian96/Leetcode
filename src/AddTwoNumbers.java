import org.jetbrains.annotations.Nullable;

import bean.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int originValue = l1.val + l2.val;
        boolean needForward = originValue >= 10;
        int value = needForward ? originValue % 10 : originValue;
        ListNode result = new ListNode(value, null);
        addTwoNumbers(result, needForward, l1.next, l2.next);
        return result;
    }

    /**
     * @param needForward 是否需要进位
     * @return
     */
    private ListNode addTwoNumbers(ListNode target, Boolean needForward, @Nullable ListNode aNode, @Nullable ListNode bNode) {
        if (aNode == null && bNode == null) {
            ListNode next = needForward ? new ListNode(1, null) : null;
            target.next = next;
            return target;
        } else {
            int aValue = aNode != null ? aNode.val : 0;
            int bValue = bNode != null ? bNode.val : 0;
            int forwardValue = needForward ? 1 : 0;
            int originValue = aValue + bValue + forwardValue;
            boolean needForwardNew = originValue >= 10;
            int value = needForwardNew ? originValue % 10 : originValue;
            ListNode next = new ListNode(value, null);
            target.next = next;
            return addTwoNumbers(next, needForwardNew, aNode == null ? null : aNode.next, bNode == null ? null : bNode.next);
        }
    }
}
