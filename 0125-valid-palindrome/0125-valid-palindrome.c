bool isPalindrome(char * s){
    size_t length = strlen(s);
    char* l = s;
    char* r = &(s[length -1]);
    while (l < r) {
        while (l < r && !(isalpha(*l) || isdigit(*l))) l++;
        while (l < r && !(isalpha(*r) || isdigit(*r))) r--;
        if (tolower(*l) != tolower(*r)) return false;
        l++;
        r--;
    }
    return true;
}