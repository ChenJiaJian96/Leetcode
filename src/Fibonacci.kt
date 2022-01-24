class Fibonacci {
    fun fib(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1

        var firstNum = 0
        var secondNum = 1
        var index = 2
        while (index <= n) {
            val preSecondNum = secondNum
            secondNum += firstNum
            firstNum = preSecondNum

            if (firstNum > 1000000007) {
                firstNum -= 1000000007
            }
            if (secondNum > 1000000007) {
                secondNum -= 1000000007
            }
            index++
        }
        return secondNum
    }
}