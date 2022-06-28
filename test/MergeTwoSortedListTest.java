import bean.ListNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MergeTwoSortedListTest {

    private final MergeTwoSortedList config = new MergeTwoSortedList();

    // 输入：l1 = [1,2,4], l2 = [1,3,4]
    // 输出：[1,1,2,3,4,4]
    @Test
    public void test_1() {
        ListNode me = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode other = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode result = config.mergeTwoLists(me, other);
        ArrayList<Integer> resultList = result.valueList();
        int[] expectResult = {1, 1, 2, 3, 4, 4};
        assertEquals(expectResult.length, resultList.size());
        for (int i = 0; i < expectResult.length; i++) {
            assertEquals(expectResult[i], resultList.get(i).intValue());
        }
    }
}