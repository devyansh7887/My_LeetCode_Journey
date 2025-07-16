class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 1;
        int temp = 0;
        while(n<num){
            if(num%n == 0){
                temp += n;
            }
            n++;
        }
        if(temp == num){
            return true;
        }else{
            return false;
        }
    }
}