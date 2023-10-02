class Solution {
    public boolean winnerOfGame(String colors) {
        char[] colorsArr = colors.toCharArray();
        int n = colors.length();
        int aCount = 0, bCount = 0;
        int i = 0;
        while(i < n) {
            int aFreq = 0, bFreq = 0;
            while (i < n && colorsArr[i] == 'A') {
                aFreq++;
                i++;
            }
            if (aFreq >= 3) aCount += aFreq - 2;
            while (i < n && colorsArr[i] == 'B') {
                bFreq++;
                i++;
            }
            if (bFreq >= 3) bCount += bFreq - 2;
        }
        return aCount > bCount;
    }
}