class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if (m * n != original.size) return Array(0) { IntArray(0) }
        var res = Array(m) { IntArray(n) }
        original.mapIndexed { index, element -> res[index / n][index % n] = element }
        return res
    }
}