class Solution {
    fun minBitFlips(start: Int, goal: Int): Int {
        var bin1 = Integer.toBinaryString(start)
        var bin2 = Integer.toBinaryString(goal)
        var maxLength = max(bin1.length, bin2.length)
        var diff = 0
        bin1 = bin1.padStart(maxLength, '0')
        bin2 = bin2.padStart(maxLength, '0')
        bin1.toCharArray().forEachIndexed { index, char1 ->
            if (char1 != bin2[index]) diff++
        }
        return diff
    }
}