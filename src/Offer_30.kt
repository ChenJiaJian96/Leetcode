import java.util.*

/**
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
class MinStack {

    private val stack = Stack<Int>()
    private var minNum: Int = Int.MIN_VALUE

    fun push(x: Int) {
        if (minNum == Int.MIN_VALUE || x < minNum) {
            minNum = x
        }
        stack.push(x)
    }

    fun pop() {
        val num = stack.pop()
        if (num == minNum) {
            findMinNum()
        }
    }

    fun top(): Int {
        return stack.lastElement()
    }

    fun min(): Int {
        return minNum
    }

    private fun findMinNum() {
        if (stack.size == 0) {
            minNum = Int.MIN_VALUE
            return
        }
        minNum = stack[0]
        for (i in 1 until stack.size) {
            val currentNum = stack[i]
            if (currentNum < minNum) {
                minNum = currentNum
            }
        }
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.min()
 */