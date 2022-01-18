import java.util.*
import kotlin.collections.ArrayList

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 剑指offer - 09 用两个栈实现队列
 */
class CQueue {

    val coldStack = LinkedList<Int>() // 冷缓存（逆序，读出时需要转到热缓存）
    val hotStack = LinkedList<Int>() // 热缓存

    fun appendTail(value: Int) {
        coldStack.add(value)
    }

    fun deleteHead(): Int {
        if (hotStack.isEmpty()) {
            if (coldStack.isEmpty()) return -1;
            while (!coldStack.isEmpty()) {
                hotStack.add(coldStack.pop());
            }
            return hotStack.pop();
        } else return hotStack.pop();
    }

    fun operate(op: ArrayList<String>, num: IntArray): ArrayList<String> {
        val result = ArrayList<String>()

        for (i in 0 until op.size) {
            if (op[i] == "CQueue") {
                result.add("null")
                continue
            }
            if (op[i] == "appendTail") {
                appendTail(num[i])
                result.add("null")
                continue
            }
            if (op[i] == "deleteHead") {
                val head = deleteHead()
                result.add(head.toString())
                continue
            }
        }

        return result
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * var obj = CQueue()
 * obj.appendTail(value)
 * var param_2 = obj.deleteHead()
 */