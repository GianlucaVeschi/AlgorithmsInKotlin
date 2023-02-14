package leetcode

fun Int.isDivisibleFor(n: Int): Boolean = this % n == 0

fun fizzBuzz(n: Int): List<String> {
    val output: MutableList<String> = MutableList(n) { "" }
    for (i in 1..n) {
        when {
            i.isDivisibleFor(3) && i.isDivisibleFor(5) -> output[i - 1] = "FizzBuzz"
            i.isDivisibleFor(3) -> output[i - 1] = "Fizz"
            i.isDivisibleFor(5) -> output[i - 1] = "Buzz"
            else -> output[i - 1] = i.toString()
        }
    }
    return output
}

// More idiomatic Kotlin
fun fizzBuzzIdiomatic(n: Int): List<String> {
    return (1..n).map {
        when {
            it.isDivisibleFor(15) -> "FizzBuzz"
            it.isDivisibleFor(3) -> "Fizz"
            it.isDivisibleFor(5) -> "Buzz"
            else -> it.toString()
        }
    }
}