class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n <= 0 || n%2 != 0) return false;
        //If n is divisible by 2 (i.e., n % 2 == 0), recursively check for n / 2.
        return isPowerOfTwo(n/2);
    }
}