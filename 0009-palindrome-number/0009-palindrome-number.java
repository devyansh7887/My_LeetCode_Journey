class Solution {
    public boolean isPalindrome(int x) {
        int i = 0;
        int temp = x;
        while(temp!=0){
            i = (i*10)+(temp%10);
            temp /= 10;
        }
        if(x<0){
            return false;
        }else if(x == 0){
            return true;
        }else if(x%10 == 0){
            return false;
        }else if(x==i){
            return true;
        }else{
            return false;
        }
    }
}