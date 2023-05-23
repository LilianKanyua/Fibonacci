fun fibonacciNumbers(n: Int): List<Int> {
    val fibonacciNumbers = mutableListOf(0, 1)

    for (i in 2 until n) {
        fibonacciNumbers.add(fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2])
    }

    return fibonacciNumbers
}