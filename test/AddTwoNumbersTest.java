import bean.ListNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    private final AddTwoNumbers config = new AddTwoNumbers();

    // 输入：l1 = [0], l2 = [0]
    // 输出：[0]
    @Test
    public void test_1() {
        ListNode me = new ListNode(0, null);
        ListNode other = new ListNode(0, null);

        ListNode result = config.addTwoNumbers(me, other);
        ArrayList<Integer> resultList = result.valueList();
        int[] expectResult = {0};
        assertEquals(expectResult.length, resultList.size());
        for (int i = 0; i < expectResult.length; i++) {
            assertEquals(expectResult[i], resultList.get(i).intValue());
        }
    }

    // 输入：l1 = [2,4,3], l2 = [5,6,4]
    // 输出：[7,0,8]
    @Test
    public void test_2() {
        ListNode me = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode other = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode result = config.addTwoNumbers(me, other);
        ArrayList<Integer> resultList = result.valueList();
        int[] expectResult = {7, 0, 8};
        assertEquals(expectResult.length, resultList.size());
        for (int i = 0; i < expectResult.length; i++) {
            assertEquals(expectResult[i], resultList.get(i).intValue());
        }
    }

    // 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    // 输出：[8,9,9,9,0,0,0,1]
    @Test
    public void test_3() {
        ListNode me = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode other = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));

        ListNode result = config.addTwoNumbers(me, other);
        ArrayList<Integer> resultList = result.valueList();

        int[] expectResult = {8, 9, 9, 9, 0, 0, 0, 1};
        assertEquals(expectResult.length, resultList.size());
        for (int i = 0; i < expectResult.length; i++) {
            assertEquals(expectResult[i], resultList.get(i).intValue());
        }
    }
}