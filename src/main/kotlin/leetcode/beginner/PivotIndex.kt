package leetcode.beginner

fun pivotIndex(nums: IntArray): Int {
    nums.forEachIndexed { index, _ ->
        val sumLeft = nums.sumArray(0, index)
        val sumRight = nums.sumArray(index + 1, nums.size)
        if (sumLeft == sumRight) return index
    }
    return -1
}

fun IntArray.sumArray(start: Int, stop: Int): Int {
    var sum = 0
    for (i in start until stop) {
        sum += this[i]
    }
    return sum
}

val input = intArrayOf(1, 7, 3, 6, 5, 6)