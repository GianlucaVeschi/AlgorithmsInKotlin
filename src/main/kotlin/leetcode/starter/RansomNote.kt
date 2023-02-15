package leetcode.starter

/**
 * Coding Challenge 383
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
 * letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val hashMap = hashMapOf<Int, Char>()
    magazine.forEachIndexed { index, c ->
        hashMap[index] = c
    }

    ransomNote.forEach {
        if (!hashMap.containsValue(it)) {
            return false
        } else {
            val key = hashMap.getKey(it)
            hashMap.remove(key)
        }
    }

    return true
}

private fun HashMap<Int, Char>.getKey(value: Char): Int {
    var result = -1
    for ((key, v) in this) {
        if (v == value) {
            result = key
        }
    }
    return result
}