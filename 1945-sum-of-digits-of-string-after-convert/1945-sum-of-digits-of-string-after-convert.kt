class Solution {
    fun getLucky(s: String, k: Int): Int {
        var num:String = ""
        var count = k
        for (char in s) num += (char - 'a' + 1).toString()
        while (count-- > 0) num = transform(num)
        return num.toInt()
    }

    fun transform(num:String):String {
        var res:Int = 0
        var number = num
        while (number.length > 0) {
            res += number.last().digitToInt()
            number = number.dropLast(1)
        }
        return res.toString()
    }
}