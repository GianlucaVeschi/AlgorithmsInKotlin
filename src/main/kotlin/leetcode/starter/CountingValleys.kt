package leetcode.starter

/**
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var altitude = 0
    var valleys = 0

    for (step in 0 until steps) {
        if(path[step] == 'D'){
            altitude--
        }
        else {
            if(altitude == -1){
                valleys++
            }
            altitude++
        }
    }
    return valleys
}