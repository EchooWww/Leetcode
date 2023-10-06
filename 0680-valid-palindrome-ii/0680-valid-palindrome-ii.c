
bool isPalindrome(char * start, char * end) {
    while (start <= end) {
        if (*start == *end) {
            start++;
            end--;
        } else return false;
    } return true;
}

bool validPalindrome(char * s) {
    size_t length = strlen(s);
    char* l = s;
    char* r = &(s[length-1]);
    while (l <= r) {
        if (*l == *r) {
            l++;
            r--;
        } else return isPalindrome(l+1, r) || isPalindrome(l, r-1);
    }
    return true;
}
