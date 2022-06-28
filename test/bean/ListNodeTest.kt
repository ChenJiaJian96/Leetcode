package bean

import org.junit.Assert.*
import org.junit.Test

class ListNodeTest {

    @Test
    fun test_equalsTo_1() {
        val me = ListNode(0)
        val other = ListNode(0)

        assertEquals(true, me.equalsTo(other))
    }

    @Test
    fun test_equalsTo_2() {
        val me = ListNode(0)
        val other = ListNode(0, ListNode(1))

        assertEquals(false, me.equalsTo(other))
    }
}