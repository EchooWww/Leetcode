class Solution {
    fun getLucky(s: String, k: Int): Int {
        var num = s.map{it - 'a' + 1}.joinToString("")
        var count = k
        while (count-- > 0 && num.length > 1) num = num.sumOf{it.digitToInt()}.toString()
        return num.toInt()
    }
}