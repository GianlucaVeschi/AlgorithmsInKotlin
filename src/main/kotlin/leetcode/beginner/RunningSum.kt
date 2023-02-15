package leetcode.beginner

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
fun runningSum(nums: IntArray): IntArray {
    var x = 0
    nums.forEachIndexed { index, element ->
        x += element
        nums[index] = x
    }
    return nums
}