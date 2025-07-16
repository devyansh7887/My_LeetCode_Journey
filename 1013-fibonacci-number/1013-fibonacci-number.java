class Solution {
    public int fib(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1;
        int i = 0;
        int j = 1;
        int temp = 0;
        int count = 2;
        while(count <= n){
            temp = i + j;
            i = j;
            j = temp;
            count++;
        }
        return j;
    }
}