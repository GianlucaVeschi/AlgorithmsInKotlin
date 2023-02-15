package leetcode.starter

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun middleNode(head: ListNode?): ListNode? {
    var count = 0
    var input = head

    while (input?.`val` != null) {
        count++
        input = input.next
    }

    val middleIndex = if (count % 2 == 0) count / 2 else (count - 1) / 2

    var tmpInput = head
    val outputNode = ListNode(0)
    while (tmpInput?.`val` != null) {
        count++
        tmpInput = tmpInput.next
        if ( count > middleIndex ){
            if (tmpInput != null) {
                outputNode.`val` = tmpInput.`val`
            }
        }
    }

    return outputNode
}