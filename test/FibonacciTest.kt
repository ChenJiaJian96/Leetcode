import org.junit.Test

import org.junit.Assert.*

class FibonacciTest {

    private val helper = Fibonacci()

    @Test
    fun fib_2() {
        assertEquals(1, helper.fib(n = 2))
    }

    @Test
    fun fib_5() {
        assertEquals(5, helper.fib(n = 5))
    }

    @Test
    fun fib_45() {
        assertEquals(134903163, helper.fib(n = 45))
    }

    @Test
    fun fib_48() {
        assertEquals(807526948, helper.fib(n = 48))
    }

    @Test
    fun fib_95() {
        assertEquals(407059028, helper.fib(n = 95))
    }

}