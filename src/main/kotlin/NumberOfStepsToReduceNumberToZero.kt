/*
    Coding Challenge 1342
    Given an integer num, return the number of steps to reduce it to zero.
    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

fun numberOfSteps(num: Int): Int {
    var input = num
    var output = 0

    while (input != 0) {
        input = if (input % 2 == 0) {
            output++
            input / 2
        } else {
            output += if (input == 1) 1 else 2
            (input - 1) / 2
        }
    }

    return output
}

fun main(args: Array<String>) {
    println(numberOfSteps(14))
    println(numberOfSteps(8))
    println(numberOfSteps(123))
}