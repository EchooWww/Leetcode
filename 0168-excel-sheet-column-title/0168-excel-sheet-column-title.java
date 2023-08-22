class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder col = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            col.append((char)('A' + columnNumber %26));
            columnNumber /= 26;
        }
        return col.reverse().toString();
    }
}