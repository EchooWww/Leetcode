double myPow(double x, int n){
    int64_t N = n;  // Cast n to int64_t to avoid overflow
    if (N < 0) {
        N = -N;
        x = 1/x;
    }
    if (N == 0) return 1;
    if (N % 2  == 0) return myPow(x*x, N/2);
    if (N % 2 == 1) return x * myPow(x*x, N/2);
    return 0;
}